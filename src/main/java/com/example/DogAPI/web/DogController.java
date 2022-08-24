package com.example.DogAPI.web;

import com.example.DogAPI.entity.Dog;
import com.example.DogAPI.service.DogService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService) { this.dogService = dogService; }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllBreeds() {
        List<Dog> list = dogService.retrieveDogBreed();
        return new ResponseEntity<List<Dog>>(list, HttpStatus.OK);
    }

}
