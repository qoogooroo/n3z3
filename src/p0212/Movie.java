package p0212;

import java.util.ArrayList;

public class Movie {
	
	
	private String title;
	private String genre;
	private	String director;
	ArrayList<String> actors = new ArrayList<>();
	private double rating;
	private int release;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDirector() {
		return director;
	}
	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}
	public ArrayList<String> getActors() {
		return actors;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public double getRating() {
		return rating;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	public int getRelease() {
		return release;
	}
	
	public String toString() {
		return "[title=" + title
				+ ", genre=" + genre
				+ ", director=" + director
				+ ", actors=" + actors
				+ ", rating=" + rating 
				+ ", release=" + release + "]";
	}
}
