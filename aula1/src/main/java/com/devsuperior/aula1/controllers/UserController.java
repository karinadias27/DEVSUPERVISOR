package com.devsuperior.aula1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.aula1.dto.UserDTO;
import com.devsuperior.aula1.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public List<UserDTO> findAll(){
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	

}
