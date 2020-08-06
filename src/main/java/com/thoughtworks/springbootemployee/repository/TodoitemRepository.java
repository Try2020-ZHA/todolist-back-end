package com.thoughtworks.springbootemployee.repository;

import com.thoughtworks.springbootemployee.entity.Todoitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoitemRepository extends JpaRepository<Todoitem, Integer> {
}
