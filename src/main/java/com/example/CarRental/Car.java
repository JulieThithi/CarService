package com.example.CarRental;


public class Car {
	
	private String plateNumber;
	private int numberOfSeats;
	private int price;
	private String dateDebut = null;
	private String dateFin = null;
	private boolean rent= false;
	//private Dates dates;

	public Car() {
		super();
	}
	
	public Car(String plateNumber, int nbOfseats, int price) {
		super();
		this.plateNumber = plateNumber;
		this.numberOfSeats=nbOfseats;
		this.price = price;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
//	public Dates getDates() {
//		return dates;
//	}
//
//	public void setDates(String bd, String ed) {
//		this.dates.setBegin(bd);
//		this.dates.setEnd(ed);
//	}

	@Override
	public String toString() {
		return "Car [plateNumber=" + plateNumber + ", numberOfSeats="+numberOfSeats+", price=" + price+"]";
	}
	
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String string) {
		this.dateDebut = string;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String string) {
		this.dateFin = string;
	}
	
	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean available) {
		this.rent = available;
	}

}