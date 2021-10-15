package com.lambdas.main;

import java.util.*;
import java.util.stream.Collectors;

import com.lambdas.modelo.Alumne;

public class Nivel3 {
	
	public void mostrarNombreYEdad(List<Alumne> alumnos) {
		System.out.println("Muestra el nombre y la edad de cada alumno:");
		alumnos.forEach(a -> System.out.println("Nombre: " + a.getNom() + ", Edad: " + a.getEdad()));
		System.out.println();
	}
	
	public void nombreComienzaConA(List<Alumne> alumnos, char letra) {
		
		List<Alumne> nombresConA = alumnos.stream()
				.filter(n -> n.getNom().charAt(0) == letra)
				.collect(Collectors.toList());
		
		System.out.println("Alumnos cuyo nombre empieza por \'" + letra + "\':");
		nombresConA.forEach(System.out::println);
		System.out.println();
	}
	
	public void filtrarPorNota(List<Alumne> alumnos, int nota) {
		System.out.println("Muestra los alumnos con un 5 o más de nota:");
		alumnos.stream()
			.filter(n -> n.getNota() >= nota)
			.forEach(System.out::println);
		
		System.out.println();
	}
	
	public void filtrarPorNotaYCurso(List<Alumne> alumnos, int nota, String curso) {
		
		System.out.println("Muestra los alumnos con un 5 o más de nota, y que no cursen \"" +  curso + "\":");
		alumnos.stream()
			.filter(n -> n.getNota() >= nota && !n.getCurs().equals(curso))
			.forEach(System.out::println);
		
		System.out.println();
	}
	
	public void filtrarPorCursoYEdad(List<Alumne> alumnos, String curso, int edad) {
		
		System.out.println("Muestra los alumnos que cursan \"" +  curso + "\" y son mayores de edad:");
		alumnos.stream()
			.filter(n -> n.getEdad() > edad && n.getCurs().equals(curso))
			.forEach(System.out::println);
		
		System.out.println();
	}
	
}
