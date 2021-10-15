package com.lambdas.main;

import java.util.*;

import com.lambdas.modelo.Alumne;


public class Main {

	public static void main(String[] args) {
		
		//Matriz de cadenas y números del Nivel2
		String [] matriz = {"casa", "17", "juego", "calamar", "456", "foto", "33", "empresa"};	
				
		Nivel1 ej1 = new Nivel1();
		Nivel2 ej2 = new Nivel2();
		Nivel3 ej3 = new Nivel3();
		
		// Nivel1.Fase1
		System.out.println("Lista de nombres propios original:");
		System.out.println(ej1.getNombresPropios());
		System.out.println();
		
		System.out.println("Resultado Ejericios Nivel1 - Fase1");
		System.out.println("---------------------------------");
				
		System.out.println("Comienza con A y tiene 3 letras");
		System.out.println(ej1.comienzaConAMayuscula());	
		System.out.println();
		
		System.out.println("Devuelve una cadena diferente si el número es Par o Impar");
		System.out.println(ej1.devolverCadena());		
		System.out.println();
		
		System.out.println("Cadenas que contienen la letra 'o'");
		System.out.println(ej1.contieneLetraO());
		System.out.println();
				
		System.out.println("Contiene la letra 'o' y más de 5 letras");
		System.out.println(ej1.contieneLetraO1());
		System.out.println();		
		
		ej1.mostrarMesesAnio();
		
		ej1.mostrarMesesAnio1();
		
		
		// Nivel1.Fase2
		System.out.println("Resultado Ejericio Nivel1 - Fase2");
		System.out.println("---------------------------------");
		double valorDePi= ej1.obtenerPi();		
		System.out.println("Pi = " + valorDePi);
		System.out.println();
		
		
		// Nivel1.Fase3
		System.out.println("Resultado Ejericio Nivel1 - Fase3");
		System.out.println("---------------------------------");
		ej1.cadenaAlReves();
		
		//Nivel2	
		System.out.println("Resultado Ejericios Nivel2");
		System.out.println("---------------------------------");
		System.out.println("Matriz original: " + Arrays.toString(matriz));
		System.out.println();
		
		
		ej2.ordenarPorLongitud(matriz);		
		
		ej2.ordenarPorLongitudInversa(matriz);
		
		ej2.ordenarAlfabeticamente(matriz);
		
		ej2.ordenarPrimeroE(matriz);
		
		ej2.cambiarApor4(matriz);
		
		ej2.mostrarSoloNumeros(matriz);
		
		//Operaciones básicas con Interfaz funcional y lambdas
		System.out.println("Operaciones básicas dados dos números:");
		ej2.operacionesBasicas(33,17);
		
				
		//Nivel3
		
		List<Alumne> alumnos = Arrays.asList(
				new Alumne("Juan", 23, "PHP", 9),
				new Alumne("Luis", 32, "REACT", 8.5),
				new Alumne("Ana", 21, "C++", 10),
				new Alumne("Luisa", 30, "JAVA", 8),
				new Alumne("Juana", 25, "ANGULAR", 9.6),
				new Alumne("Alberto", 17, "C#", 9),
				new Alumne("Lorena", 31, "C#", 5.5),
				new Alumne("Maria", 27, "PHP", 4.8),
				new Alumne("Eva", 16, "NODE", 2.5),
				new Alumne("Silvia", 23, "VUEJS", 3.2)
				);
		
		
		//lista de todos los alumnos:
		System.out.println("Listado de alumnos original:");
		alumnos.forEach(System.out::println);
		System.out.println();
		
		//Mostra per pantalla el nom i l’edat de cada alumne. 
		ej3.mostrarNombreYEdad(alumnos);
		
		//alumnes que el nom comensi per “a”
		ej3.nombreComienzaConA(alumnos, 'A');
		
		//alumnes que tinguin un 5 o mes de nota. 
		ej3.filtrarPorNota(alumnos, 5);
		
		//alumnes que tinguin un 5 o mes de nota y que no siguin de PHP.
		ej3.filtrarPorNotaYCurso(alumnos, 5, "PHP");
		
		//alumnes que facin JAVA i siguin majors d’edat.
		ej3.filtrarPorCursoYEdad(alumnos, "JAVA", 18);
	}

}
