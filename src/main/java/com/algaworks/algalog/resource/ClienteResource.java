package com.algaworks.algalog.resource;

import java.util.Arrays;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.algaworks.algalog.domain.Cliente;

@RestController
public class ClienteResource {

	@GetMapping("/users")
	public List<Cliente> list() {
		Cliente use1 = new Cliente();
		use1.setAdress("round rock");
		use1.setId(382);
		use1.setName("obervil");
		
		Cliente use2 = new Cliente();
		use2.setAdress("austin texas");
		use2.setName("obersong");
		use2.setId(2123);
		//User us = new User(1, "GAD", "rua maria 19");
		return Arrays.asList(use1,use2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
