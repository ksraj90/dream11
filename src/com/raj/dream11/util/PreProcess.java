package com.raj.dream11.util;

import java.util.ArrayList;

import com.raj.entity.Player;

public class PreProcess {
	
	public double[] getPoints(ArrayList<Player> players) {
		double[] points = new double[players.size()];
		for(int i=0;i<players.size();i++) {
			points[i] = players.get(i).getPoint();
		}
		return points;
	}
	
	public ArrayList<Integer> getSolutions( double[] points) {
		ArrayList<Integer> solutions= new ArrayList<Integer>();
		for (int i = 0; i < points.length; i++) {
			solutions.add(0);
		}
		return solutions;
	}
	
	public ArrayList<Integer> getTeamPlayerCounts(ArrayList<Player> players) {
		ArrayList<Integer> getTeamPlayerCount= new ArrayList<Integer>();
		getTeamPlayerCount.add(-1);
		getTeamPlayerCount.add(-1);
		getTeamPlayerCount.add(-1);
		getTeamPlayerCount.add(-1);
		for(int i=0;i<players.size();i++) {
			
			if(players.get(i).getRole().equalsIgnoreCase("WK")) {
				getTeamPlayerCount.set(0, getTeamPlayerCount.get(0)+1);
			}
			if(players.get(i).getRole().equalsIgnoreCase("BAT")) {
				getTeamPlayerCount.set(1, getTeamPlayerCount.get(1)+1);
			}
			if(players.get(i).getRole().equalsIgnoreCase("ALL")) {
				getTeamPlayerCount.set(2, getTeamPlayerCount.get(2)+1);
			}
			if(players.get(i).getRole().equalsIgnoreCase("BOW")) {
				getTeamPlayerCount.set(3, getTeamPlayerCount.get(3)+1);
			}
			
		}
		return getTeamPlayerCount;
	}
	
	public ArrayList<Integer> getTeamPlayerCounts(ArrayList<Player> players, ArrayList<Integer> solution) {
		ArrayList<Integer> getTeamPlayerCount= new ArrayList<Integer>();
		getTeamPlayerCount.add(0);
		getTeamPlayerCount.add(0);

		String firstTeam = "";
		firstTeam = players.get(0).getTeam();
		for(int i=0;i<players.size();i++) {
			if( players.get(i).getTeam().equalsIgnoreCase(firstTeam)) {
				getTeamPlayerCount.set(0, getTeamPlayerCount.get(0)+solution.get(i));
			} else {
				getTeamPlayerCount.set(1, getTeamPlayerCount.get(1)+solution.get(i));
			}
		}
		return getTeamPlayerCount;
	}
	
	
}
