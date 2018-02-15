package com.cip.prog6;

import java.util.*;

public class EjercicioEntregar6 {

	static int[] tabla = new int[20];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < tabla.length; i++) {

			tabla[i] = (int) (Math.random() * 10);
		}
		/*
		 * for (int aleatorio : tabla) {
		 * 
		 * System.out.print(aleatorio + " "); }
		 */
		Scanner sc = new Scanner(System.in);

		int opcion;
		do {
			// imprimir el menu
			System.out.println("");
			System.out.println("Menú \n");
			System.out.println("1.- Imprimir el mayor valor del Array");
			System.out.println("2.- Imprimir el menor valor del Array");
			System.out.println("3.- Calcular la media de todos los valores del Array");
			System.out.println("4.- Imprimir todos los valores del Array");
			System.out.println("0.- Salir");
			System.out.println("Su opción ");
			// pedir opcion al usuario
			opcion = sc.nextInt();

			// usamos switch ejecutar acciones
			switch (opcion) {

			case 1:
				System.out.println(imprimirMayor());
				break;
			case 2:
				System.out.println(imprimirMenor());
				break;
			case 3:
				System.out.println(mediaArray());
				break;
			case 4:
				imprimirValores();
				break;
			case 0:
				System.out.println("Gracias por usar este programa");
				break;
			default:
				System.out.println("Por favor, introduce un valor entre 0 y 4");
			}

		} while (opcion != 0);

		sc.close();
	}

	public static int imprimirMayor() {

		int mayor = 0;

		for (int i = 0; i < tabla.length; i++) {

			if (tabla[i] > mayor) {
				mayor = tabla[i];
			}
		}
		return mayor;
	}

	public static int imprimirMenor() {

		int menor = 11;

		for (int i = 0; i < tabla.length; i++) {

			if (tabla[i] < menor) {

				menor = tabla[i];
			}
		}
		return menor;
	}

	public static double mediaArray() {

		double media=0.0;
     	
		for (int i = 0; i < tabla.length; i++) {
			media = media + tabla[i];
			
		}
		media = media / tabla.length;
		return media;
	}

	public static void imprimirValores() {

		for (int todos : tabla) {

			System.out.print(todos + " ");

		}

	}

}