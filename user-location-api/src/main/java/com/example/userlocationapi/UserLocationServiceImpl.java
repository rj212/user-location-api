package com.example.userlocationapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLocationServiceImpl implements com.example.userlocationapi.service.UserLocationService {

    @Autowired
    private UserLocationRepository userLocationRepository;

    @Override
    public UserLocationApiApplication.UserLocation createUserLocation(UserLocationApiApplication.UserLocation userLocation) {
        return userLocationRepository.save(userLocation);
    }

    @Override
    public UserLocationApiApplication.UserLocation updateUserLocation(Long id, UserLocationApiApplication.UserLocation userLocation) {
        // Implement update logic using the repository
    }

    @Override
    public List<UserLocationApiApplication.UserLocation> getNearestUsers(int n) {
        // Implement nearest user retrieval logic using the repository
    }
}

