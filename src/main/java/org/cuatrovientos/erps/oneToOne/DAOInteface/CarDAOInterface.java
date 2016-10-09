package org.cuatrovientos.erps.oneToOne.DAOInteface;

import java.util.List;

import org.cuatrovientos.erps.oneToOne.models.Car;

public interface CarDAOInterface {
	public Car selectById(Long id);
	public List<Car> selectAll ();
	public void insert (Car car);
	public void update (Car car);
	public void delete (Car car);
}
