package com.algaworks.algalog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algalog.domain.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

	
	
	 List<Client> findByName(String name);
	
	
	
	
	
	
	
	
	
	
	
	
}
