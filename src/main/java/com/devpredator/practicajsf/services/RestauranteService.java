/**
 * 
 */
package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Restaurante;

/**
 * @author heber
 *
 */
public class RestauranteService {
	
	public List<Restaurante> consultarRestaurantes(){
		
		List<Restaurante> restaurantes=new ArrayList<Restaurante>();
		
		Restaurante restauranteA = new Restaurante();
		Restaurante restauranteB = new Restaurante();
		Restaurante restauranteC = new Restaurante();
		Restaurante restauranteD = new Restaurante();
		Restaurante restauranteE = new Restaurante();
		
		restauranteA.setNombre("Domino's Pizza");
		restauranteA.setDireccion("Southampton");
		restauranteA.setPais("Inglaterra");
		restauranteA.setGerente("James Ward-Prowse");
		
		restauranteB.setNombre("McDonald's");
		restauranteB.setDireccion("Lisboa");
		restauranteB.setPais("Portugal");
		restauranteB.setGerente("João Palhinha");
		
		restauranteC.setNombre("Carl's Jr");
		restauranteC.setDireccion("Anderlecht");
		restauranteC.setPais("Bélgica");
		restauranteC.setGerente("Charles de Ketelaere");
		
		restauranteD.setNombre("Burger King");
		restauranteD.setDireccion("Oslo");
		restauranteD.setPais("Noruega");
		restauranteD.setGerente("Martin Ødegaard");
		
		restauranteE.setNombre("Pizza Hut");
		restauranteE.setDireccion("Seattle");
		restauranteE.setPais("Estados Unidos");
		restauranteE.setGerente("Tyler Adams");
		
		restaurantes.add(restauranteA);
		restaurantes.add(restauranteB);
		restaurantes.add(restauranteC);
		restaurantes.add(restauranteD);
		restaurantes.add(restauranteE);
		
		return restaurantes;
	}

}
