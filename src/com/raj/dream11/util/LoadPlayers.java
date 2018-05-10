package com.raj.dream11.util;

import java.util.ArrayList;

import com.raj.entity.Player;

public class LoadPlayers {
	public ArrayList<Player> createPlayers() {
		ArrayList<Player> players = new ArrayList<Player>();

		players.add(new Player("Parthiv Patel","MUM",8.5,"WK"));
		players.add(new Player("MS Dhoni","PNE",9.5,"WK"));
		players.add(new Player("Kieron Pollard","MUM",9.5,"BAT"));
		players.add(new Player("Steven Smith","PNE",10.5,"BAT"));
		players.add(new Player("Rahul Tripathi","PNE",8.5,"BAT"));
		players.add(new Player("Rohit Sharma","MUM",10,"BAT"));
		players.add(new Player("Ajinkya Rahane","PNE",9,"BAT"));
		players.add(new Player("Nitish Rana","MUM",8.5,"BAT"));
		players.add(new Player("Manoj Tiwary","PNE",9,"BAT"));
		players.add(new Player("Lendl Simmons","MUM",9,"BAT"));
		players.add(new Player("Ambati Rayudu","MUM",8.5,"BAT"));
		players.add(new Player("Hardik Pandya","MUM",8.5,"ALL"));
		players.add(new Player("Krunal Pandya","MUM",9,"ALL"));
		players.add(new Player("Daniel Christian","PNE",9,"ALL"));
		players.add(new Player("Washington Sundar","PNE",8,"ALL"));
		players.add(new Player("Jaydev Unadkat","PNE",9,"BOW"));
		players.add(new Player("Jasprit Bumrah","MUM",8.5,"BOW"));
		players.add(new Player("Mitchell McClenaghan","MUM",9,"BOW"));
		players.add(new Player("Karn Sharma","MUM",8,"BOW"));
		players.add(new Player("Shardul Thakur","PNE",8.5,"BOW"));
		players.add(new Player("Lasith Malinga","MUM",8.5,"BOW"));
		players.add(new Player("Harbhajan Singh","MUM",8,"BOW"));
		players.add(new Player("Adam Zampa","PNE",8.5,"BOW"));
		players.add(new Player("Mitchell Johnson","MUM",8.5,"BOW"));
		players.add(new Player("Lockie Ferguson","PNE",8,"BOW"));
		players.add(new Player("Tim Southee","MUM",8.5,"BOW"));

		return players;
	}
}
