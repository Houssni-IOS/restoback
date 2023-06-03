package com.example.demo.entity;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;



@Entity
public class Restaurant {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column
	private String nom ;
	@Column
	private String adresse ;
	@Column
	private String longitude ;
	@Column
	private String lattitude;
	@Column 
	private String num_tel;
	@Column
    private LocalTime openAt;
	@Column
    private LocalTime closeAt;
	private String serie ;


	private String photo ;
	private String specialities ;
  	 @ManyToOne
	    @JoinColumn(name = "zone_id")
	    private Zone zone;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	public String getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}
	public LocalTime getOpenAt() {
		return openAt;
	}
	public void setOpenAt(LocalTime openAt) {
		this.openAt = openAt;
	}
	public LocalTime getCloseAt() {
		return closeAt;
	}
	public void setCloseAt(LocalTime closeAt) {
		this.closeAt = closeAt;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}







}
