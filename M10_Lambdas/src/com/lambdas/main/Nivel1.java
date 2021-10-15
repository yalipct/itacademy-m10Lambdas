package com.lambdas.main;

import java.util.*;
import java.util.stream.*;

import com.lambdas.interfaces.IObtener;
import com.lambdas.interfaces.IReverse;

public class Nivel1 {	
	
	private List<String> nombresPropios;
	private List<String> meses;
	
		
	public Nivel1() {
		
		nombresPropios = new ArrayList<>();
		nombresPropios.add("Alberto");
		nombresPropios.add("Pablo");
		nombresPropios.add("Juan");
		nombresPropios.add("Antonio");
		nombresPropios.add("Ana");
		nombresPropios.add("Ann");		
		
		
		meses = new ArrayList<>();
		meses.add("enero");
		meses.add("febrero");
		meses.add("marzo");
		meses.add("abril");
		meses.add("mayo");
		meses.add("junio");
		meses.add("julio");
		meses.add("agosto");
		meses.add("septiembre");
		meses.add("octubre");
		meses.add("noviembre");
		meses.add("diciembre");
	}
	
	//obtener la lista de nombres
	public List<String> getNombresPropios() {
		return nombresPropios;
	}	
	
	//Métodos Nivel1.Fase1
	
	public List<String> comienzaConAMayuscula() {
		/*Tenint una llista de cadenes de noms propis, 
		 * escriu un mètode que retorne una llista 
		 * de totes les cadenes que comencen amb la lletra 'a' (mayuscula)
		 * i tenen exactament 3 lletres. Imprimeix el resultat*/
		
		List<String> lista = nombresPropios.stream()
					.filter(x -> x.startsWith("A") && x.length()==3)
				 	.collect(Collectors.toList());
		
		return lista;		
	}
	

	public String devolverCadena() {
		/*Escriu un mètode que retorne una cadena separada per comes 
		 * basada en una llista d’Integers. Cada element hauria d'anar 
		 * precedit per la lletra "e" si el nombre és parell, 
		 * i precedit de la lletra "o" si el nombre és imparell. 
		 * Per exemple, si la llista d'entrada és (3,44), 
		 * la sortida hauria de ser "o3, e44". Imprimeix el resultat. */
		
		List<Integer> numeros = Arrays.asList(3,44,25, 10, 33, 66);
		
		String cadena = numeros.stream()
				.map(n -> (n % 2 == 0) ? "e" + n : "o" + n)
				.collect(Collectors.joining(","));
			
		return cadena;
	}
	
	
	public List<String> contieneLetraO() {
		/*Tenint una llista de Strings, escriu un mètode que 
		 * retorne una llista de totes les cadenes que continguen 
		 * la lletra ‘o’ i imprimeix el resultat. */
		
		List<String> lista = nombresPropios.stream()
			.filter(x -> x.contains("o"))
			.collect(Collectors.toList());
		
		return lista;			
	}

	
	public List<String> contieneLetraO1() {
		/*Has de fer el mateix que en el punt anterior, però 
		 * retornant una llista que incloga els elements amb 
		 * més de 5 lletres. Imprimeix el resultat. */
		
		List<String> lista = nombresPropios.stream()
				.filter(x -> x.contains("o") && x.length() > 5)
				.collect(Collectors.toList());
		
		return lista;				
	}
	
	
	public void mostrarMesesAnio() {
		/*Crea una llista amb els nombs dels mesos de l’any.
		 * Imprimeix tots els elements de la llista amb una lambda. */		
		
		//mostrar con lambda
		System.out.println("Muestra los meses del año con una lambda");
		meses.forEach(m -> System.out.println(m));
		System.out.println();
	}
	
	
	public void mostrarMesesAnio1() {
		/*Has de fer la mateixa impressió del punt anterior però fent-ho mitjançant method reference. */		
				
		//mostrar con method reference
		System.out.println("Muestra los meses del año con referencia a método");
		meses.forEach(System.out::println);
		System.out.println();
	}
	
	
	//Nivel1.Fase2
	public double obtenerPi() {
		IObtener pi = () -> 3.1415;
		return pi.getPiValue();
	}
	
	//Nivel1.Fase3	
	public void cadenaAlReves() {
		
		IReverse cad = (str) -> {
			StringBuilder cadena = new StringBuilder(str);
			
			return cadena.reverse().toString();
		};		
		
		System.out.println("Cadena original: 'Interfaz Funcional'");
		System.out.println("Cadena al revés: " + cad.reverse("Interfaz Funcional"));
		System.out.println();
		
	}
	
}
