package com.codingdojo;

public class Murcielago {
	private double energia;
	
	public Murcielago () {
		this.energia = 300;
	}
	
	public Murcielago(double energia) {
		this.energia = energia;
	}
	
	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Murcielago [energia=" + energia + "]";
	}
	
	public Murcielago volar() {
		if (this.getEnergia() >= 50) {
			System.out.println("Sonido, despegando vuelo");
			this.energia -= 50;
			System.out.println(this.toString());
		} else {
			System.out.println("Energía insuficiente");
			System.out.println(this.toString());
		}
		return this;
	}

	public Murcielago comerHumanos() {
		System.out.println("Sonido, comiendo humanos");
		this.energia += 25;
		System.out.println(this.toString());
		return this;
	}
	
	public Murcielago atacarPueblo() {
		if (this.getEnergia() >= 100) {
			System.out.println("Sonido, pueblo en llamas");
			this.energia -= 100;
			System.out.println(this.toString());
		} else {
			System.out.println("Energía insuficiente");
			System.out.println(this.toString());
		}
		return this;
	}
}
