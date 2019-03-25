package org.wecancodeit.databasemovies.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Director {
	
	@Id
	@GeneratedValue
	private Long id;
	private String directorName;
	@OneToMany(mappedBy="director")
	private Collection<Movie> movies;
	
	public Director(String directorName) {
		this.directorName = directorName;
	}
	
	public Director() {}

	public Long getId() {
		return id;
	}

	public String getDirectorName() {
		return directorName;
	}
	
	public Collection<Movie> getMovies() {
		return movies;
	}
}
