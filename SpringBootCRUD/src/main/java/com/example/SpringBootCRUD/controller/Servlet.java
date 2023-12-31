package com.example.SpringBootCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootCRUD.dao.Dao;
import com.example.SpringBootCRUD.model.ModelUser;


@RestController
@ResponseBody
public class Servlet {
	
	@Autowired
	Dao dao;
	
	@PostMapping("/registerpage")
	public ModelUser register(ModelUser m) {
		dao.save(m);
		return m;
	}
	
	@GetMapping("/getdata/{id}")
	public ModelUser getData(@PathVariable("id") int id) {
		ModelUser m = dao.findById(id).orElse(new ModelUser());
		return m;
	}
	
	@GetMapping("/getdata")
	public List<ModelUser> getAllData() {
		List<ModelUser> list = dao.findAll();
		return list;
	}
	
	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable("id") int id) {
		ModelUser m = dao.getOne(id);
		dao.delete(m);
		return "User Deleted";
	}
	
	@PutMapping("/updatedata")
	public ModelUser updateData(@RequestBody ModelUser m) {
		dao.save(m);
		return m;
	}

}
