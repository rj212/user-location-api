package com.example.userlocationapi.controller;

import com.example.userlocationapi.UserLocationApiApplication;
import com.example.userlocationapi.UserLocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public class UserLocationController
{
    @RestController
    @RequestMapping("/api")
    public static class userlocationcontroller {

        @Autowired
        private UserLocationService userLocationService;

        @PostMapping("/create_data")
        public UserLocationApiApplication.UserLocation createUserLocation(@RequestBody UserLocationApiApplication.UserLocation userLocation) {
            return userLocationService.createUserLocation(userLocation);
        }

        @PatchMapping("/update_data/{id}")
        public UserLocationApiApplication.UserLocation updateUserLocation(@PathVariable Long id, @RequestBody UserLocationApiApplication.UserLocation userLocation) {
            return userLocationService.updateUserLocation(id, (UserLocationApiApplication.UserLocation) UserLocationApiApplication.UserLocation);
        }

        @GetMapping("/get_users/{n}")
        public List<UserLocationApiApplication.UserLocation> getNearestUsers(@PathVariable int n) {
            return userLocationService.getNearestUsers(n);
        }
    }
}
