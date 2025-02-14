package p0212;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		/*
			TreeKingdoms			30000	tactical simulation
			League of Legends		0		MOBA
			Kart Raider				0		Racing
			Starcraft				15000	RTS
			Overwatch				32000	FPS
		*/
		ArrayList<Game> gameList = new ArrayList<>();
		
		Game game1 = new Game();
		game1.setName("ThreeKingdoms");
		game1.setPrice(30000);
		game1.setGenre("tactical simulation");
		Game game2 = new Game();
		game2.setName("League of Legends");
		game2.setPrice(0);
		game2.setGenre("MOBA");
		Game game3 = new Game();
		game3.setName("Kart Raider");
		game3.setPrice(0);
		game3.setGenre("Racing");
		Game game4 = new Game();
		game4.setName("Starcraft");
		game4.setPrice(15000);
		game4.setGenre("RTS");
		Game game5 = new Game();
		game5.setName("Overwatch");
		game5.setPrice(0);
		game5.setGenre("FPS");
		
		gameList.add(game1);
		gameList.add(game2);
		gameList.add(game3);
		gameList.add(game4);
		gameList.add(game5);
		
		for(Game g:gameList) {
			if(g.getGenre().indexOf("R")!=-1 && g.getPrice()!=0) {
				System.out.println(g);	
			}
		}
		for(Game g:gameList) {
			//price 가 15000~30000
			if(g.getPrice() >= 15000 && g.getPrice() < 30000) {
				System.out.println(g);
			}
		}
	}
}
