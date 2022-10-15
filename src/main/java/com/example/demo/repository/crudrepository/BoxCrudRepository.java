package com.example.demo.repository.crudrepository;

import com.example.demo.model.Box;
import org.springframework.data.repository.CrudRepository;

public interface BoxCrudRepository extends CrudRepository<Box,Integer> {
}
