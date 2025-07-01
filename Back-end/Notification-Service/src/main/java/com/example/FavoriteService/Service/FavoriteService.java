package com.example.FavoriteService.Service;

import com.example.FavoriteService.Domain.UserFavorite;

import java.util.List;

public interface FavoriteService {

    public void welcomeMail(UserFavorite usersDTO);

    public void orderMail(UserFavorite usersDTO);

    public void resetPasswordMail(UserFavorite usersDTO);




}


