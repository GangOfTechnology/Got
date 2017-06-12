package com.java.designpatterns.ri.creational.builder;

/**
 * Car Class with its properties.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class Car {

	// Mandatory parameters
	private String brand;
	
	private String engineCapacity;

	// optional parameters
	private boolean isAutoTransmission;
	
	private boolean isLuxuryModel;

	public String getHDD() {
		return brand;
	}

	public String getRAM() {
		return engineCapacity;
	}

	public boolean isAutoTransmissionEnabled() {
		return isAutoTransmission;
	}

	public boolean isLuxuryModelEnabled() {
		return isLuxuryModel;
	}

	private Car(CarBuilder builder) {
		this.brand = builder.brand;
		this.engineCapacity = builder.engineCapacity;
		this.isAutoTransmission = builder.isAutoTransmission;
		this.isLuxuryModel = builder.isLuxuryModel;
		System.out.println("Building Car of Brand :: "+brand+", EngineCapacity :: "+engineCapacity+", Auto-Transmission :: "+isAutoTransmission+", Luxury-Model :: "+isLuxuryModel);
	}

	
	/**
	 * CarBuilder Class.
	 * 
	 * @author Got
	 * @version 1.0
	 * @since 2017-5-26
	 */
	public static class CarBuilder {

		// Mandatory parameters
		private String brand;
		
		private String engineCapacity;

		// optional parameters
		private boolean isAutoTransmission;
		
		private boolean isLuxuryModel;

		public CarBuilder(String brand, String engineCapacity) {
			this.brand = brand;
			this.engineCapacity = engineCapacity;
		}

		public CarBuilder setAutoTransmissionEnabled(boolean isAutoTransmission) {
			this.isAutoTransmission = isAutoTransmission;
			return this;
		}

		public CarBuilder setLuxuryModelEnabled(boolean isLuxuryModel) {
			this.isLuxuryModel = isLuxuryModel;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}