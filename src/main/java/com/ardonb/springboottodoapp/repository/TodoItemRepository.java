package com.ardonb.springboottodoapp.repository;


import com.ardonb.springboottodoapp.model.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

}
