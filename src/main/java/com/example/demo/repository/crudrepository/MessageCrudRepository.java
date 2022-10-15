package com.example.demo.repository.crudrepository;

import com.example.demo.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
