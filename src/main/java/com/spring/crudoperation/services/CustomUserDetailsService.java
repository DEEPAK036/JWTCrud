package com.spring.crudoperation.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.equals("Sahil")){
            return new User("Sahil", "Sahil1234", new ArrayList<>());
        }
        else{
            throw new UsernameNotFoundException("User Doesn't exist!!");
        }
    }
    
}
