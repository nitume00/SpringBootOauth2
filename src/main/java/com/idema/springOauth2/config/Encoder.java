package com.idema.springOauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Encoder {
	
	//different encryptions for OAuth2 client and user,
		@Bean
	    public PasswordEncoder oauthClientPasswordEncoder() {
	        return new BCryptPasswordEncoder(4);
	    }
	    
	    /*@Bean
	    public PasswordEncoder userPasswordEncoder() {
	        return new BCryptPasswordEncoder(8);
         }*/
	    
}
