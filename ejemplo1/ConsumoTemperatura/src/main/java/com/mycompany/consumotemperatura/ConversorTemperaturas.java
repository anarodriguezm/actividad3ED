package com.mycompany.consumotemperatura;

import java.util.Scanner;
public class ConversorTemperaturas {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al convertidor de temperaturas\n");
	System.out.print("Introduce el valor que quieres convertir : ");
	float value = scan.nextFloat();
	System.out.println("  Introduce 1 para convertir de Celsius a Fahrenheit ....");
	System.out.println("   Introduce 2 para convertir de Fahrenheit a Celsius ....");
	System.out.print("\nintroduce tu valor aqui...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Tu conversion esta aqui.. "+value1+"ºF");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Tu conversion esta aqui.. "+value3+"ºC");
		}
	System.out.println("\n\tGracias!!..");
	}
}
