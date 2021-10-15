package com.lambdas.main;

import java.util.*;
import java.util.stream.*;

import com.lambdas.interfaces.IOperacio;

public class Nivel2 {
	/*ORDENAR POR:*/
	//longitud (de m�s curta a m�s llarga) 
	public void ordenarPorLongitud(String[] array) {		
		
		List<String> lista = Stream.of(array)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
		
		System.out.println("Ordena de la cadena m�s corta a la m�s larga");
		System.out.println(lista);
		System.out.println();
	}
	
	//longitud inversa (de  m�s llarga a m�s curta) 
	public void ordenarPorLongitudInversa(String[] array) {
		
		List<String> lista = Stream.of(array)
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList()); 
		
		System.out.println("Ordena de la cadena m�s larga a la m�s corta");
		System.out.println(lista);
		System.out.println();
	}
	
	//alfab�ticament pel primer car�cter (Nota: charAt (0) retorna el codi num�ric del primer car�cter)	
	public void ordenarAlfabeticamente(String[] array) {
		
		List<String> lista = Stream.of(array)
				.sorted(Comparator.comparing(v -> v.charAt(0)))
				.collect(Collectors.toList()); 
		
		System.out.println("Cadenas ordenadas alfab�ticamente");        
		System.out.println(lista);
		System.out.println();		
	}
	
	//Les cadenes que contenen "e" primer, tota la resta en segon lloc.
	public void ordenarPrimeroE(String[] array) {
		
		Arrays.sort(array, (s1, s2) -> {
            if(s1.contains("e") && s2.contains("e")) return 0;
            else if (s1.contains("e")) return -1;
            else return 1;
        });
		
		System.out.println("Muestra las cadenas que contienen 'e' primero");        
		System.out.println(Arrays.toString(array));
		System.out.println();
	}
	
	//Modifica tots els elements de la matriu per canviar els caracters �a� a �4� 
	public void cambiarApor4(String[] array) {
		
		List<String> lista = Stream.of(array)
				.map(v -> v.replaceAll("a", "4"))
				.collect(Collectors.toList()); 
		
		System.out.println("Cambio de los caracteres 'a' por '4'");        
		System.out.println(lista);
		System.out.println();
	}
	
	//Mostra nom�s els elements que siguin 100% numerics. (tot i que estigui guardats com strings)
	public void mostrarSoloNumeros(String[] array) {
		
		List<String> lista = Stream.of(array)
				.filter(v -> v.matches("\\d+"))
				.collect(Collectors.toList()); 
		
		System.out.println("Muestra solo los elementos 100% num�ricos contenidos en la matriz");        
		System.out.println(lista);
		System.out.println();
	}
	
	//Operaciones b�sicas ((+)(-)(*)(/)) Interfaz funcional IOperacio
	
	public void operacionesBasicas(int numero1, int numero2) {
		
		IOperacio suma = Integer::sum;
		IOperacio resta = (v1, v2) -> v1 - v2;
		IOperacio multiplicacion = (v1, v2) -> v1 * v2;
		IOperacio division = (v1, v2) -> (float)v1 / (float)v2;
		
		System.out.printf("N�meros: %d y %d\n", numero1, numero2);
        System.out.printf("Suma de los n�meros: %.0f\n", suma.operacio(numero1, numero2));
        System.out.printf("Resta de los n�meros: %.0f\n", resta.operacio(numero1, numero2));
        System.out.printf("Producto de los n�meros: %.0f\n", multiplicacion.operacio(numero1, numero2));
        System.out.printf("Cociente de los n�meros: %.1f\n", division.operacio(numero1, numero2));
        System.out.println();
	}
	
	
}
