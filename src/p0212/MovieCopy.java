package p0212;

import java.util.ArrayList;

public class MovieCopy {
	//Window - preferences - keys - generate~
	//자주 사용하는것 단축키 설정법

	private String title;

	private String genre;
	private	String director;
	ArrayList<String> actors = new ArrayList<>();
	private double rating;
	private int release;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public ArrayList<String> getActors() {
		return actors;
	}
	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getRelease() {
		return release;
	}
	public void setRelease(int release) {
		this.release = release;
	}
	
	@Override			//'@' = annotation, 컴퓨터가 알아듣는 주석
	//@override 의 경우 컴파일러가 아래 method 가 override 되었는지 문법적으로 체크해줌
	public String toString() {
		return "MovieCopy [title=" + title + ", genre=" + genre + ", director=" + director + ", actors=" + actors
				+ ", rating=" + rating + ", release=" + release + "]";
	}
}
