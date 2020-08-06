package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Todoitem;
import com.thoughtworks.springbootemployee.service.TodoitemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin("*")
public class TodoitemController {
    @Resource
    TodoitemService todoitemService;

    @GetMapping(value = "/todoitems")
    public List<Todoitem> getAllTodoitems(){
        return todoitemService.getTodoitems();
    }

    @PostMapping(value = "/todoitems")
    public void addTodoitem(@RequestBody Todoitem todoitem){
        todoitemService.addTodoitem(todoitem);
    }

    @PutMapping(value = "/todoitems/{id}")
    public void updateTodoitem(@PathVariable int id,@RequestBody Todoitem todoitem){
        todoitemService.updateTodoitem(id,todoitem);
    }

    @DeleteMapping(value = "/todoitems/{id}")
    public boolean deleteTodoitem(@PathVariable int id){
        return todoitemService.deleteTodoitem(id);
    }
}