package com.example.DogAPI.service;

import com.example.DogAPI.entity.Dog;

import java.util.List;

public interface DogService {

    List<Dog> retrieveDogBreed();

    void retrieveDogBreedById();
    void retrieveDogNames();

}
