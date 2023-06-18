package com.monocept.movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieFactory {
	
public static List<Movie> getmovie() throws FileNotFoundException{
	List<Movie>Movies=new ArrayList<>();
	File MovieData=new File(MovieManager.MoviefilePath);
	Scanner scanner=new Scanner(MovieData);
	int id=1;
	while(scanner.hasNextLine()) {
		String line[] = scanner.nextLine().split(",");
//		Movie obj=new Movie(Integer.parseInt(line[0]),line[1],Integer.parseInt(line[2]),line[3]);
		Movie obj=new Movie(id,line[0],Integer.parseInt(line[2]),line[1]);
		Movies.add(obj);
		id++;
		
	}
	
	
	
	return Movies;
}
}
