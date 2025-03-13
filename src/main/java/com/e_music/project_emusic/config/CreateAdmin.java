package com.e_music.project_emusic.config;

import com.e_music.project_emusic.services.ServiceAddress;
import com.e_music.project_emusic.services.ServiceCart;
import com.e_music.project_emusic.services.ServiceRol;
import com.e_music.project_emusic.services.ServiceUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CreateAdmin implements CommandLineRunner {

    @Autowired
    private ServiceUser serviceUser;

    @Autowired
    private ServiceAddress serviceAddress;

    @Autowired
    private ServiceCart serviceCart;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ServiceRol serviceRol;

    @Override
    public void run(String... args) throws Exception {
       

    }
}
