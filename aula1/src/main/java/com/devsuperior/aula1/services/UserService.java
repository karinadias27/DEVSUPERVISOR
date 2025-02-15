package com.devsuperior.aula1.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.aula1.dto.UserDTO;
import com.devsuperior.aula1.entities.User;
import com.devsuperior.aula1.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}

	
	
	@Transactional(readOnly = true)
	public List<UserDTO>findAll() {
		List<User> list = repository.findAll();
		List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());

		return  listDTO;
	} 
}
