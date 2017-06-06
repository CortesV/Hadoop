package com.devcortes.hadoop.generatedata;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.devcortes.hadoop.components.entity.Car;
import com.devcortes.hadoop.components.interfaces.ICar;

@Service
@Scope("prototype")
public class GenerateDataThread implements Runnable {
	
	private static final Logger LOGGER = Logger.getLogger(GenerateDataThread.class);

	private final static String[] colors;

	private final static String[] brands;

	@Autowired
	private ICar iCar;
	
	static {
		colors = new String[10];
		colors[0] = "Black";
		colors[1] = "White";
		colors[2] = "Green";
		colors[3] = "Red";
		colors[4] = "Blue";
		colors[5] = "Orange";
		colors[6] = "Silver";
		colors[7] = "Yellow";
		colors[8] = "Brown";
		colors[9] = "Maroon";

		brands = new String[10];
		brands[0] = "BMW";
		brands[1] = "Mercedes";
		brands[2] = "Volvo";
		brands[3] = "Audi";
		brands[4] = "Renault";
		brands[5] = "Fiat";
		brands[6] = "Volkswagen";
		brands[7] = "Honda";
		brands[8] = "Jaguar";
		brands[9] = "Ford";
	}

	public List<Car> generateBatch() {

		List<Car> batchCars = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			Car randomCar = new Car(getRandomId(), getRandomYear(), getRandomBrand(), getRandomModel(),
					getRandomColor(), getRandomPrice());
			batchCars.add(randomCar);
		}
		return batchCars;
	}

	@Override
	public void run() {
		iCar.generateCars(generateBatch());
		LOGGER.info("DONE");
	}

	private String getRandomId() {
		return UUID.randomUUID().toString();
	}

	private String getRandomModel() {
		return UUID.randomUUID().toString().substring(0, 3);
	}

	private int getRandomYear() {
		return (int) (Math.random() * 50 + 1960);
	}

	private String getRandomColor() {
		return colors[(int) (Math.random() * 10)];
	}

	private String getRandomBrand() {
		return brands[(int) (Math.random() * 10)];
	}

	private int getRandomPrice() {
		return (int) (Math.random() * 1000000);
	}

}
