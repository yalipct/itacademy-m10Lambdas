package com.lambdas.main;

import java.util.*;
import java.util.stream.*;

import com.lambdas.interfaces.IOperacio;

public class Nivel2 {
	/*ORDENAR POR:*/
	//longitud (de més curta a més llarga) 
	public void ordenarPorLongitud(String[] array) {		
		
		List<String> lista = Stream.of(array)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
		
		System.out.println("Ordena de la cadena más corta a la más larga");
		System.out.println(lista);
		System.out.println();
	}
	
	//longitud inversa (de  més llarga a més curta) 
	public void ordenarPorLongitudInversa(String[] array) {
		
		List<String> lista = Stream.of(array)
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList()); 
		
		System.out.println("Ordena de la cadena más larga a la más corta");
		System.out.println(lista);
		System.out.println();
	}
	
	//alfabèticament pel primer caràcter (Nota: charAt (0) retorna el codi numèric del primer caràcter)	
	public void ordenarAlfabeticamente(String[] array) {
		
		List<String> lista = Stream.of(array)
				.sorted(Comparator.comparing(v -> v.charAt(0)))
				.collect(Collectors.toList()); 
		
		System.out.println("Cadenas ordenadas alfabéticamente");        
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
	
	//Modifica tots els elements de la matriu per canviar els caracters “a” a “4” 
	public void cambiarApor4(String[] array) {
		
		List<String> lista = Stream.of(array)
				.map(v -> v.replaceAll("a", "4"))
				.collect(Collectors.toList()); 
		
		System.out.println("Cambio de los caracteres 'a' por '4'");        
		System.out.println(lista);
		System.out.println();
	}
	
	//Mostra només els elements que siguin 100% numerics. (tot i que estigui guardats com strings)
	public void mostrarSoloNumeros(String[] array) {
		
		List<String> lista = Stream.of(array)
				.filter(v -> v.matches("\\d+"))
				.collect(Collectors.toList()); 
		
		System.out.println("Muestra solo los elementos 100% numéricos contenidos en la matriz");        
		System.out.println(lista);
		System.out.println();
	}
	
	//Operaciones básicas ((+)(-)(*)(/)) Interfaz funcional IOperacio
	
	public void operacionesBasicas(int numero1, int numero2) {
		
		IOperacio suma = Integer::sum;
		IOperacio resta = (v1, v2) -> v1 - v2;
		IOperacio multiplicacion = (v1, v2) -> v1 * v2;
		IOperacio division = (v1, v2) -> (float)v1 / (float)v2;
		
		System.out.printf("Números: %d y %d\n", numero1, numero2);
        System.out.printf("Suma de los números: %.0f\n", suma.operacio(numero1, numero2));
        System.out.printf("Resta de los números: %.0f\n", resta.operacio(numero1, numero2));
        System.out.printf("Producto de los números: %.0f\n", multiplicacion.operacio(numero1, numero2));
        System.out.printf("Cociente de los números: %.1f\n", division.operacio(numero1, numero2));
        System.out.println();
	}
	
	
}
