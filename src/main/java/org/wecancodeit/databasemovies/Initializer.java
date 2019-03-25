package org.wecancodeit.databasemovies;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.databasemovies.repositories.DirectorRepository;
import org.wecancodeit.databasemovies.repositories.MovieRepository;

@Service
public class Initializer implements CommandLineRunner {
	
	@Resource
	DirectorRepository directorRepo;
	
	@Resource
	MovieRepository movieRepo;

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
