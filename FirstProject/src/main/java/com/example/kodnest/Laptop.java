package com.example.kodnest;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
  int lapid = 101;
  String brand = "Dell";
  int price = 30000;
  
  
  public Laptop(int lapid, String brand, int price) {
	super();
	this.lapid = lapid;
	this.brand = brand;
	this.price = price;
  }


  public Laptop() {
	super();
  }


  public int getLapid() {
	return lapid;
  }


  public void setLapid(int lapid) {
	this.lapid = lapid;
  }


  public String getBrand() {
	return brand;
  }


  public void setBrand(String brand) {
	this.brand = brand;
  }


  public int getPrice() {
	return price;
  }


  public void setPrice(int price) {
	this.price = price;
  }


  @Override
  public int hashCode() {
	return Objects.hash(brand, lapid, price);
  }


  @Override
  public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Laptop other = (Laptop) obj;
	return Objects.equals(brand, other.brand) && lapid == other.lapid && price == other.price;
  }


  @Override
  public String toString() {
	return "Laptop [lapid=" + lapid + ", brand=" + brand + ", price=" + price + "]";
  }
  
  
}
