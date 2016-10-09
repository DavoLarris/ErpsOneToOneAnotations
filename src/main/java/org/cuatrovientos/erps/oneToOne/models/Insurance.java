package org.cuatrovientos.erps.oneToOne.models;

public class Insurance {
	private String company;
	private Double cost;
	private Long id;
	private String type;
	
	public Insurance() {}
	
	/**
	 * @param company
	 * @param cost
	 * @param id
	 * @param type
	 */
	public Insurance(String company, Double cost, Long id, String type) {
		this.company = company;
		this.cost = cost;
		this.id = id;
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
