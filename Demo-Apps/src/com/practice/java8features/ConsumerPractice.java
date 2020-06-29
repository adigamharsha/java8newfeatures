package com.practice.java8features;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Movie{
	String movieName;
	String actor;
	String actress;
	
	public Movie(String movieName, String actor, String actress) {
		super();
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
	}

	@Override
	public String toString() {
		return String.format("[movieName :: %s , HeroName :: %s, Heroine :: %s]", movieName,actor,actress);
	}
	
	
	
}
public class ConsumerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> movieList = new ArrayList<Movie>();
		List<Movie> movieLi = new ArrayList<Movie>();
		
		Consumer<Movie> c = (m) -> movieList.add(m);
		
		movieLi.add(new Movie("BahuBali-1" , "Prabhas" , "Anushka"));
		movieLi.add(new Movie("BahuBali-2" , "Rana" , "Tamanna"));
		movieLi.add(new Movie("Gulabo Sitabo" , "Amitabh" , "Ayushman"));
		movieLi.add(new Movie("Piku" , "Amitabh" , "Deepika"));
		
		movieLi.forEach(m -> c.accept(m));
		
		System.out.println("Movies List :::"+movieList);

	}

}
