package com.algaworks.algalog.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.Client;
import com.algaworks.algalog.repositories.ClientRepository;

@RestController
public class ClientResource {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping(value = "/clients")
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
}
