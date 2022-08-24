package com.example.DogAPI.service;

import com.example.DogAPI.entity.Dog;
import com.example.DogAPI.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogBreed() { return (List<Dog>) dogRepository.findAll(); }
    // a list of Dog breeds

    public void retrieveDogBreedById() {};
    // a list of Dog breeds by Id
    // if an id is requested that doesn’t exist, appropriately handle the error

    public void retrieveDogNames(){};
    // a list of Dog names





}
