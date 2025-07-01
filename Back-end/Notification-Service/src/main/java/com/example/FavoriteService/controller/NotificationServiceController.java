package com.example.FavoriteService.controller;

import com.example.FavoriteService.Domain.UserFavorite;
import com.example.FavoriteService.Service.FavoriteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("mail")
public class NotificationServiceController {
private FavoriteService favoriteService;

    @Autowired
    public NotificationServiceController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @PostMapping("/sendmail")
    public ResponseEntity<?> addRestaurantToFavorites(@RequestBody UserFavorite userDTO  ) {

        favoriteService.welcomeMail(userDTO);
        return new ResponseEntity<>( "done", HttpStatus.CREATED);
    }
    @PostMapping("/sendordermail")
    public ResponseEntity<?> sendOrdermail(@RequestBody UserFavorite userDTO  ) {

        favoriteService.orderMail(userDTO);
        return new ResponseEntity<>( "done", HttpStatus.CREATED);
    }
    @PostMapping("/sendresetrmail")
    public ResponseEntity<?> sendresetmail(@RequestBody UserFavorite userDTO  ) {

        favoriteService.resetPasswordMail(userDTO);
        return new ResponseEntity<>( "done", HttpStatus.CREATED);
    }


}
