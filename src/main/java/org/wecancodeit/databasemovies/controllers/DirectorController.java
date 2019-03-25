package org.wecancodeit.databasemovies.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.databasemovies.models.Director;
import org.wecancodeit.databasemovies.repositories.DirectorRepository;

@RestController
public class DirectorController {

	@Resource
	DirectorRepository directorRepo;
	
	@GetMapping("/directors")
	public Collection<Director> getDirectors() {
		return (Collection<Director>)directorRepo.findAll();
	}
}
