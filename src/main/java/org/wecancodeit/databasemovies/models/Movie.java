package org.wecancodeit.databasemovies.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private Long id;
	private String movieName;
	private String genre;
	private int year;
	@ManyToOne
	@JsonIgnore
	private Director director;
	
	public Movie(String movieName, String genre, int year, Director director) {
		this.movieName = movieName;
		this.genre = genre;
		this.year = year;
		this.director = director;
	}
	
	public Movie() {}

	public Long getId() {
		return id;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}
	
	public Director getDirector() {
		return director;
	}
	
}
