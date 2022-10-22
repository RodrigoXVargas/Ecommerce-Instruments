package com.e_music.project_emusic.config;

import com.e_music.project_emusic.entities.MyUserDetails;
import com.e_music.project_emusic.repositories.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private RepositoryUser repositoryUser;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .regexMatchers("/admin/*").hasRole("ADMIN")
                .regexMatchers("/user/*").authenticated()
                .anyRequest()
                .permitAll()
                .and()
                .formLogin();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetails(repositoryUser)).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Autowired
    public MyUserDetails myUserDetails(RepositoryUser repositoryUser) throws Exception {
        return new MyUserDetails(repositoryUser);
    }
}