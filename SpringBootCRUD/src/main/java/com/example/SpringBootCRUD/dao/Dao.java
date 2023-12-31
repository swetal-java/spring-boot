package com.example.SpringBootCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootCRUD.model.ModelUser;

public interface Dao extends JpaRepository<ModelUser, Integer>{

}
