package com.example.DogAPI.repository;

import com.example.DogAPI.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
