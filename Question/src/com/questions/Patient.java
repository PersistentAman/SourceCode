
package com.questions;
public class Patient {

	private String name;
	private String disease;
	private int amount;
	private Adress Adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisease() {
		return disease;
	}
	public Patient(String name, String disease, int amount, Adress Adress) {
		super();
		this.name = name;
		this.disease = disease;
		this.amount = amount;
		this.Adress= Adress;
	}
	
	public Adress getAdress() {
		return Adress;
	}
	public void setAdress(Adress adress) {
		Adress = adress;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", disease=" + disease + ", amount=" + amount + ", Adress=" + Adress + "]";
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
