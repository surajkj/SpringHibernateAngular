package com.crud.rest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.rest.beans.Movies;
import com.crud.rest.dao.MoviesDao;

public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesDao moviesDao;

	public void setMoviesDao(MoviesDao moviesDao){
		this.moviesDao=moviesDao;
	}
	
	@Override
	public Movies getMovies() {
		return moviesDao.getMovies();
	}

	@Override
	public void setMovies(Movies movies) {
		moviesDao.setMovies(movies);
		
	}
	
	

}
