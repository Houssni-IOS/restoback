package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface VilleRepository extends JpaRepository<Ville, Integer> {

	List<Ville> findAll();
	Ville findBynom(String nom);
	Ville findByid(Integer id);
}
