package com.codingdojo;

public class TestMurcielago {

	public static void main(String[] args) {
		
		Murcielago murcielago1 = new Murcielago();
		Murcielago murcielago2 = new Murcielago(380);
		System.out.println(murcielago1.toString());
		System.out.println(murcielago2.toString());
		
		murcielago1.atacarPueblo().atacarPueblo().atacarPueblo();
		murcielago2.atacarPueblo().atacarPueblo().atacarPueblo();
		
		murcielago1.comerHumanos().comerHumanos();
		murcielago2.comerHumanos().comerHumanos();
		
		murcielago1.volar().volar();
		murcielago2.volar().volar();
	}
}
