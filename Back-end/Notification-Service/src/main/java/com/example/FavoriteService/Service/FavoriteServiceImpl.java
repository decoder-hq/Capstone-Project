package com.example.FavoriteService.Service;

import com.example.FavoriteService.Domain.UserFavorite;
import com.example.FavoriteService.Repository.UserFavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FavoriteServiceImpl implements  FavoriteService {

    @Autowired
    private UserFavoriteRepository userRepos;

    @Autowired
    private JavaMailSender mailSender;


    @Override
    public void welcomeMail(UserFavorite usersDTO) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("niit.go4food@gmail.com");
        message.setTo(usersDTO.getEmail());
        message.setText("Hello "+usersDTO.getEmail()+usersDTO.getMessage()+"\n Thanks For Registering....Have A Exciting Food journey ");
        message.setSubject("Welcome To GO 4 Food");
        mailSender.send(message);
        System.out.println("Mail Send...");
    }

    @Override
    public void orderMail(UserFavorite usersDTO) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("niit.go4food@gmail.com");
        message.setTo(usersDTO.getEmail());
        message.setText("Hello "+usersDTO.getEmail()+usersDTO.getMessage()+"\n");
        message.setSubject("Oder Details");
        mailSender.send(message);
        System.out.println("Mail Send...");
    }

    @Override
    public void resetPasswordMail(UserFavorite usersDTO) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("niit.go4food@gmail.com");
        message.setTo(usersDTO.getEmail());
        message.setText("Hello "+usersDTO.getEmail()+"\n"+usersDTO.getMessage()+"\n" );
        message.setSubject("Password Reset");
        mailSender.send(message);
        System.out.println("Mail Send...");
    }

}