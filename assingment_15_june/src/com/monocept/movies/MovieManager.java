package com.monocept.movies;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
private List<Movie>Movies;
private static List<Movie>finalMovies;
static final String MoviefilePath="E:/15_assingment/Country.txt";
public MovieManager() {
	
	Movies =new ArrayList<Movie>();
	loadMovies();
	
}
private void loadMovies() {
	try {
		Movies=MovieFactory.getmovie();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
}
public void addmovie(Movie movie) {
	Movies.add(movie);
	System.out.println("Movie added");
}
public void clearmovie() {
	Movies.clear();
	System.out.println("Movie cleared");
}
public List<Movie> getMovie(){
	System.out.println("There are "+Movies.size()+" Movies :");
	Movies.forEach(movie->System.out.println(movie));
	return Movies;
	
}
public void saveMovie() {
	finalMovies=Movies;
	System.out.println("Movies Saved");
}
public void deleteMovie() {
	Movies=new ArrayList<Movie>();
	System.out.println("Movies Deleted");
}

}
