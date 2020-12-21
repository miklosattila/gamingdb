package gamingdb.demo.service.impl;

import gamingdb.demo.model.Developer;
import gamingdb.demo.repository.Testrepository;
import gamingdb.demo.service.HelloService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class HelloServiceImplementation implements HelloService{

	@Autowired
	Testrepository testRepo;
	
	@Override
	@Transactional
	public void addnew(Developer test) {

	testRepo.save(test);

	}

	
}
