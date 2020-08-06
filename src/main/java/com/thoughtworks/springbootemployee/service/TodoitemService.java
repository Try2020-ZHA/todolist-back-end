package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Todoitem;

import java.util.List;

public interface TodoitemService {

    public List<Todoitem> getTodoitems();

    void addTodoitem(Todoitem todoitem);

    void updateTodoitem(int id, Todoitem todoitem);

    boolean deleteTodoitem(int id);
}
