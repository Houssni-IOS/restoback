package com.example.demo.service;

import com.example.demo.entity.Restaurant;

import java.util.List;

public interface Dao<T> {
	T GetByName(String nom);

	List<T> GetAll();
	T Save(T t);
	void Delete(Integer id);
	T Update(Integer id, T t);


}
