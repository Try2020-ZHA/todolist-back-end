package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Todoitem;
import com.thoughtworks.springbootemployee.exception.TodoitemNotFoundException;
import com.thoughtworks.springbootemployee.repository.TodoitemRepository;
import com.thoughtworks.springbootemployee.service.TodoitemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collector;

@Service

public class TodoitemServiceImpl implements TodoitemService {

@Resource
private TodoitemRepository todoitemRepository;

    public List<Todoitem> getTodoitems(){
        return this.todoitemRepository.findAll();
    }

    @Override
    public void addTodoitem(Todoitem todoitem) {
        this.todoitemRepository.save(todoitem);
    }

    @Override
    public void updateTodoitem(int id, Todoitem todoitem) {
        todoitem.setId(id);
        todoitem.setStatus(!todoitem.isStatus());
        todoitemRepository.findById(id).orElseThrow(TodoitemNotFoundException::new);
        this.todoitemRepository.save(todoitem);
    }

    @Override
    public boolean deleteTodoitem(int id) {
        todoitemRepository.findById(id).orElseThrow(TodoitemNotFoundException::new);
        todoitemRepository.deleteById(id);
        return true;
    }


}
