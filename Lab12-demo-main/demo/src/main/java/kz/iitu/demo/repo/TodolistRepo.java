package kz.iitu.demo.repo;
import kz.iitu.demo.model.Todolist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.util.List;

public interface TodolistRepo  extends  JpaRepository<Todolist , Long>{
    List<Todolist> findbyname(String name);
}

