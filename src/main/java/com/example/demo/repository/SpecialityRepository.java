package com.example.demo.repository;


import com.example.demo.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
    Speciality findByNom(String nom);
}