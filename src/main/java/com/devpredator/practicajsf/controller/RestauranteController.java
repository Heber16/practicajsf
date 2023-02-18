/**
 * 
 */
package com.devpredator.practicajsf.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

/**
 * @author heber
 *
 */
@ManagedBean
@ViewScoped
public class RestauranteController {
	
	private List<Restaurante> restaurantes;
	private List<Restaurante> restaurantesFiltrados;
	
	/**
	 * @return the restaurantesFiltrados
	 */
	public List<Restaurante> getRestaurantesFiltrados() {
		return restaurantesFiltrados;
	}

	/**
	 * @param restaurantesFiltrados the restaurantesFiltrados to set
	 */
	public void setRestaurantesFiltrados(List<Restaurante> restaurantesFiltrados) {
		this.restaurantesFiltrados = restaurantesFiltrados;
	}

	private RestauranteService restauranteService = new RestauranteService();
	
	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}
	
	private void consultarRestaurantes() {
		this.restaurantes=this.restauranteService.consultarRestaurantes();
	}
	
	public List<Restaurante> getRestaurantes(){
		return restaurantes;
	}
	
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes=restaurantes;
	}

}
