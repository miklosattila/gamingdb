package ro.mutinystudio.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.mutinystudio.demo.messages.OsztalyMsg;
import ro.mutinystudio.demo.repository.OsztalyRepository;
import ro.mutinystudio.demo.service.HelloService;;

@Service()
public class HelloServiceImplementation implements HelloService{

	@Autowired
	OsztalyRepository osztalyRepo;
	
	public List<OsztalyMsg> szamol() {
		
		System.out.println("hello service szamol metodus");
		return osztalyRepo.findAll().stream().map(OsztalyMsg::new).collect(Collectors.toList());
//		System.out.println("end" + osztalyok);
	}

}
