package com.monocept.movies;

import java.util.Scanner;

public class MovieController {
	
	public MovieManager Movie_Manager;
	Scanner scanner=new Scanner(System.in);
	public MovieController() {
		
		Movie_Manager = new MovieManager();
	}
	public void start() {
		System.out.println("Movies in list are : ");
//		Movie_Manager.getMovie().forEach(movie->System.out.println(movie));
	}
	public void displaymenu() {
		System.out.println("Here are following actions in aplication :"+
				" \n 1. add movie"
				+ "\n 2. clear movie"
				+ "\n 3. get movie"
				+ "\n 4. save movies"
				+ "\n 5. delete movies"
				+ "\n press 0 for exit"
				);
		int action=scanner.nextInt();
		while(action!=0) {
			if(action==1)Movie_Manager.addmovie(null);
			if(action==2)Movie_Manager.clearmovie();
			if(action==3)Movie_Manager.getMovie();
			if(action==4)Movie_Manager.saveMovie();
			if(action==5)Movie_Manager.deleteMovie();
			action=scanner.nextInt();
		}
		
	}

	public Movie setMoviedetails(Movie movie) {
		Movie_Manager.addmovie(movie);
		return movie;
	}
	

}
