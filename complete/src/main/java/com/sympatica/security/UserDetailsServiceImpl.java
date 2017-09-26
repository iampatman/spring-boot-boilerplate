package com.sympatica.security;

import com.sympatica.entity.ApplicationUser;
import com.sympatica.DataAccess.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Created by NguyenTrung on 14/9/17.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser user = userRepository.findByEmail(username);
        if (user == null){
            throw new UsernameNotFoundException(username);
        }
        return new User(user.getEmail(),user.getPassword(), Collections.emptyList());
    }
}
