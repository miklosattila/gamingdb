package gamingdb.demo.service.implementation;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import gamingdb.demo.model.Role;
import gamingdb.demo.model.User;
import gamingdb.demo.repository.RoleRepository;
import gamingdb.demo.repository.UserRepository;
import gamingdb.demo.service.EmailService;
import gamingdb.demo.service.UserService;



@Service
public class UserServiceImpl implements UserService, UserDetailsService {
	
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private EmailService emailService;
	
	private final String USER_ROLE = "USER";

	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}

		return new UserDetailsImpl(user);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public String registerUser(User userToRegister) {
		User userCheck = userRepository.findByEmail(userToRegister.getEmail());

		if (userCheck != null)
			return "alreadyExists";

		Role userRole = roleRepository.findByRole(USER_ROLE);
		if (userRole != null) {
			userToRegister.getRoles().add(userRole);
		} else {
			userToRegister.addRoles(USER_ROLE);
		}
		String activation_code=generateKey();
		userToRegister.setEnabled(false);
		emailService.sendMessage(userToRegister.getEmail(),activation_code);
		userToRegister.setActivation(activation_code);
		userRepository.save(userToRegister);
		
		

		return "ok";
	}

	public String generateKey()
    {
		String key = "";
		Random random = new Random();
		char[] word = new char[16]; 
		for (int j = 0; j < word.length; j++) {
			word[j] = (char) ('a' + random.nextInt(26));
		}
	
		return new String(word);
    }

	@Override
	public String userActivation(String code) {
		User user = userRepository.findByActivation(code);
		if (user == null)
		    return "noresult";
		
		user.setEnabled(true);
		user.setActivation("");
		userRepository.save(user);
		return "ok";
	}
	

}