package org.cuatrovientos.erps.oneToOne.models;

import javax.persistence.*;

@Entity
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String company;
	private Double cost;
	private String type;
	
	//Comentario para hacer BIDIRECCIONAL
	
	//@OneToOne(mappedBy = "car")
	//private Car car;
	
	public Insurance() {}
	
	/**
	 * @param company
	 * @param cost
	 * @param id
	 * @param type
	 */
	public Insurance(String company, Double cost, Long id, String type) { //Car car
		this.company = company;
		this.cost = cost;
		this.id = id;
		this.type = type;
		//this.car = car;
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
	
	/**public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	**/
	
	@Override
	public String toString() {
		return "ID=" + this.id + ", company " + this.company + ", cost=" + this.cost + ",  type=" + this.type;
	}
	
}
