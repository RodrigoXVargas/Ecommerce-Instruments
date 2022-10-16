package com.e_music.project_emusic.controllers;

import com.e_music.project_emusic.entities.Cart;
import com.e_music.project_emusic.services.ServiceCartImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/emusic/carts")
public class CartController extends BaseControllerImpl<Cart, ServiceCartImpl> {
}