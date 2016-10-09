package org.cuatrovientos.erps.oneToOne.models;

public class Car {
	private Long id;
	private Insurance insurance;
	private String model;
	private String registration;
	
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
