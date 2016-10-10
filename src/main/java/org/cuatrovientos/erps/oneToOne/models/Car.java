package org.cuatrovientos.erps.oneToOne.models;

import javax.persistence.*;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	private String registration;
	
	@OneToOne(cascade = { CascadeType.ALL } )
	private Insurance insurance;
	
	public Car() {}
	
	/**
	 * @param id
	 * @param insurance
	 * @param model
	 * @param registration
	 */
	public Car(Long id, Insurance insurance, String model, String registration) {
		this.id = id;
		this.insurance = insurance;
		this.model = model;
		this.registration = registration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
}
