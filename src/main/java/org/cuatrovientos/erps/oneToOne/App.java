package org.cuatrovientos.erps.oneToOne;

import java.util.Date;
import java.util.List;
import org.cuatrovientos.erps.oneToOne.models.*;
import org.cuatrovientos.erps.oneToOne.DAO.*;
import org.cuatrovientos.erps.oneToOne.DAOInteface.CarDAOInterface;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void showAll(CarDAOInterface carDAO) {
		// SELECT ALL DATA
		List<Car> cars = carDAO.selectAll();
		System.out.println("--- CARS ----- table contents	-----------");
		for (Car car : cars) {
			System.out.println("Id: " + car.getId());
			System.out.println(" - Model: " + car.getModel());
			System.out.println(" - Registration: " + car.getRegistration());
			System.out.println(" - Insurance: \n" + car.getInsurance().toString());

			
		}
		System.out.println("Total Companies: " + cars.size());
	}
	
	
    public static void main( String[] args )
    {
    	CarDAOInterface carDAO = new CarDAO();
    	
    	// INSERT DATA
    	Car car1 = new Car(1l, null, "ModeloA", "Registro1");
    	Insurance insurance1 = new Insurance("Company 1", 250.4, 1l, "Tipo 1");
    	
    	Car car2 = new Car(2l, null, "ModeloA", "Registro2");
    	Insurance insurance2 = new Insurance("Company 2", 250.4, 2l, "Tipo 1");
    	
    	insurance1.setId(1l);
    	insurance2.setId(2l);
    	car1.setInsurance(insurance1);
    	car2.setInsurance(insurance2);
    	
    	
    	carDAO.insert(car1);
    	carDAO.insert(car2);
    	
    	
		showAll(carDAO);

		// INSERT NEW DATA
		Car newCar = new Car(3l, null, "ModeloA", "Registro2");
		newCar.setInsurance(new Insurance("Company 3", 250.4, 3l, "Tipo 1"));
		
		carDAO.insert(newCar);
		System.out.println("Inserted id: " + newCar.getId());		
		System.out.println("\nShow data after new insert");
		showAll(carDAO);
		
		// SELECT JUST ONE
		Car oneCar = carDAO.selectById(Long.valueOf(1));
		System.out.println("\nShow the car with ID=1");
		System.out.println("--- CAR ----- table contents	-----------");
		System.out.println("Selected Name: " + oneCar.toString());

		// UPDATE DATA
    	newCar.setInsurance(new Insurance("Company New", 250.4, 3l, "Tipo 1"));
		carDAO.update(newCar);
		System.out.println("\nShow data after update");
		showAll(carDAO);

		// DELETE DATA
		carDAO.delete(car1);
		System.out.println("\nShow data after deletion");
		showAll(carDAO);
    }
}
