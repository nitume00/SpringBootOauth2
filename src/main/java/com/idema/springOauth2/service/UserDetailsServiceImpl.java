package com.idema.springOauth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.idema.springOauth2.model.User;
import com.idema.springOauth2.repo.UserRepo;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	@Transactional(readOnly =true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user = userRepo.findByUsername(username);
		if(user !=null) {
			return user;
		}
		throw new UsernameNotFoundException(username);
		
	}

}
