package Tareas;

import java.util.Scanner;

public class Tarea_03 {

	public static void main(String[] args) {
		// Tarea 03
		
		Scanner entrada = new Scanner(System.in);
		int op = 0;
		double f,c,result;
		System.out.println("Seleccione una opcion: 1) Fahrenheit a Celsius 2) Celsius a Fahrenheit");
		op = entrada.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Ingrese su valor en Fahrenheit");
			f = entrada.nextDouble();
			result = (f-32)*5/9;
			System.out.println("Su conversion en grados Celsius es: " + result); 
		case 2:
			System.out.println("Ingrese su valor en Celsius");
			c = entrada.nextDouble();
			result = (c*9/5)+32;
			System.out.println("Su conversion en grados Celsius es: " + result);
		
		}
		
entrada.close();
	}

}
