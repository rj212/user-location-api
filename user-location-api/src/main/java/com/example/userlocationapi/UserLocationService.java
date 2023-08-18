package com.example.userlocationapi.service;

import com.example.userlocationapi.UserLocationApiApplication;


import java.util.List;

public interface UserLocationService {
    UserLocationApiApplication.UserLocation createUserLocation(UserLocationApiApplication.UserLocation userLocation);
    UserLocationApiApplication.UserLocation updateUserLocation(Long id, UserLocationApiApplication.UserLocation userLocation);
    List<UserLocationApiApplication.UserLocation> getNearestUsers(int n);
}
