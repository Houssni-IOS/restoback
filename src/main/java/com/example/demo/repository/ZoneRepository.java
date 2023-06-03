package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ZoneRepository extends JpaRepository<Zone, Long> {
	List<Zone> findAll();
	Zone findByNomAndVille_Nom(String nomZone, String nomVille);

	Zone findBynom(String nom);
	Zone findByid(Integer id);
}
