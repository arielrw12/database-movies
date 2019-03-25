package org.wecancodeit.databasemovies.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.databasemovies.models.Movie;
import org.wecancodeit.databasemovies.repositories.MovieRepository;

@RestController
public class MovieController {

	@Resource
	MovieRepository movieRepo;
	
	@GetMapping("/movies")
	public Collection<Movie> getMovies() {
		return (Collection<Movie>)movieRepo.findAll();
	}
}
