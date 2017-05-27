package com.crud.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.rest.beans.Movies;
import com.crud.rest.beans.MyCustomer;
import com.crud.rest.service.MoviesService;

@RestController
public class MoviesController {
	
	@Autowired
	private MoviesService moviesService;
	
	@RequestMapping(value = "/Movies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getMovie(){
		System.out.println("Coming In getMovie");
		return new ResponseEntity<String>("Welcome to Java", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/MoviesList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Movies> getMovieList(){
		System.out.println("Coming In getMovieList");
		Movies movies=moviesService.getMovies();
		return new ResponseEntity<Movies>(movies, HttpStatus.OK);
	}
	
}
