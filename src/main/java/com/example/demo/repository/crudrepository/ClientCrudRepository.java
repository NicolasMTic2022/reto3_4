package com.example.demo.repository.crudrepository;


import com.example.demo.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}
