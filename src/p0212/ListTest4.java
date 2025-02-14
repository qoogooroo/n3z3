package p0212;

import java.util.ArrayList;
import java.util.Arrays;

public class ListTest4 {

	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		movie1.setTitle("Amelie");
		movie1.setGenre("Romantic Comedy");
		movie1.setDirector("Jean-Pierre Jeunet");
//		ArrayList<String> m1Actors = new ArrayList<>();
//		m1Actors.add("Audery Tautou");
//		m1Actors.add("Mathieu Kassovitz");
//		m1Actors.add("Rufus");
//		movie1.setActors(m1Actors);	//["Audery Tautou","Mathieu Kassovitz","Rufus"]
		movie1.setActors(new ArrayList<String>(Arrays.asList("Audery Tautou","Mathieu Kassovitz","Rufus")));
		// ArrayList 초기화 조금더 연습해보기!
		movie1.setRating(8.3);
		movie1.setRelease(2001);
		
		Movie movie2 = new Movie();
		movie2.setTitle("Carnage");
		movie2.setGenre("Comedy");
		movie2.setDirector("Roman Polanski");
		movie2.setActors(new ArrayList<String>(Arrays.asList("Jodie Foster","Kate Winslet","Christoph Waltz")));
		movie2.setRating(7.1);
		movie2.setRelease(2011);
		
		Movie movie3 = new Movie();
		movie3.setTitle("Gon-ji-am");
		movie3.setGenre("Horror");
		movie3.setDirector("Jun Bum-shik");
		movie3.setActors(new ArrayList<String>(Arrays.asList("Oh Ah-Yeon","Wi Ha-joon","Yoo Je-Yoon")));
		movie3.setRating(0.5);
		movie3.setRelease(2018);
		
		Movie movie4 = new Movie();
		movie4.setTitle("Zootopia");
		movie4.setGenre("Adventure");
		movie4.setDirector("Byron Howard");
		movie4.setActors(new ArrayList<String>(Arrays.asList("Ginnifer Goodwin","Jason Bateman","Idris Elba")));
		movie4.setRating(8.0);
		movie4.setRelease(2016);
		
		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		movieList.add(movie4);
		
		for(Movie m:movieList) {
			if(m.getRating() > 7.0 && m.getGenre().contains("Comedy")) {
				System.out.println(m);
			}
		}
		
	}
}
