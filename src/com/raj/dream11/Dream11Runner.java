package com.raj.dream11;

import java.util.ArrayList;

import com.raj.dream11.util.LoadPlayers;
import com.raj.dream11.util.PreProcess;
import com.raj.entity.Player;

public class Dream11Runner {

	public static final float TOTAL_POINT = 100.0f;
	public static final int TOTAL_PLAYER = 11;
	
	public static int solution_count = 0;
	
	public static ArrayList<Player> players;
	
	public static int wk = 0;
	public static int bat = 0; 
	public static int all = 0; 
	public static int bow = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoadPlayers lp = new LoadPlayers();
		players = lp.createPlayers();
		PreProcess pp = new PreProcess();
		double[] points = pp.getPoints(players);
				
		ArrayList<Integer> solutions= pp.getSolutions(points);
		
		ArrayList<Integer> getTeamPlayerCount= pp.getTeamPlayerCounts(players);
		wk = getTeamPlayerCount.get(0);
		bat = getTeamPlayerCount.get(1);
		all = getTeamPlayerCount.get(2);
		bow =getTeamPlayerCount.get(3);
		
		find(points, 0, 0, TOTAL_POINT,solutions);
		
		

	}
	
	
	public static void find(double[] A, float currSum, int index, float sum,
			ArrayList<Integer> solution) {

		if (currSum == sum || (currSum <= sum && isEleven(solution))) {
			if(isValid(solution)) {
				
				System.out.println("Solution #"+(++solution_count));
				float total_point = 0;
			for (int i = 0; i < solution.size(); i++) {
				if (solution.get(i) == 1) {
					total_point += players.get(i).getPoint();
					System.out.println("  " + players.get(i).getName()+" "+players.get(i).getRole()+" "+players.get(i).getTeam());
				}
			}
			System.out.println("Total Points "+total_point);
			System.out.println("");
			System.out.println("");
			}

		} else if (index == A.length) {
			return;
		} else {
			solution.set(index,1);// select the element
			currSum += A[index];
			find(A, currSum, index + 1, sum, solution);
			currSum -= A[index];	
			solution.set(index, 0);// do not select the element
			find(A, currSum, index + 1, sum, solution);
		}
		return;
	}
	
	public static boolean isValid(ArrayList<Integer> solution) {
		
		PreProcess pp = new PreProcess();
		ArrayList<Integer> getTeamPlayerCount= pp.getTeamPlayerCounts(players,solution);
		int team1Sum = getTeamPlayerCount.get(0);
		int team2Sum = getTeamPlayerCount.get(1);
		
		int sum = 0;
		for(int i=0 ; i<=wk ; i++) {
			sum +=solution.get(i);
		}
		
		if(sum != 1) {
			return false;
		}
		
		sum = 0;
		for(int i=wk+1 ; i<=wk+bat+1 ; i++) {
			sum +=solution.get(i);
		}
		
		if(sum < 3 || sum > 5) {
			return false;
		}
		
		sum = 0;
		for(int i=wk+bat+2 ; i<=wk+bat+all+2 ; i++) {
			sum +=solution.get(i);
		}
		
		if(sum < 1 || sum > 3) {
			return false;
		}
		
		sum = 0;
		for(int i=wk+bat+all+3 ; i<=wk+bat+all+bow+3 ; i++) {
			sum +=solution.get(i);
		}
		
		if(sum < 3 || sum > 5) {
			return false;
		}			
		
		if(team1Sum < 5 || team1Sum > 6) {
			return false;
		}
		
		if(team2Sum < 5|| team2Sum > 6) {
			return false;
		}
		
		/*int impPlayers = solution.get(0)+solution.get(1)+solution.get(2)+solution.get(4)+solution.get(8);
		
		if(impPlayers != 5) {
			return false;
		}*/
		
		return true;
	}
	
	
	public static boolean isEleven(ArrayList<Integer> solution) {
		int count = 0;
		for (int i = 0; i < solution.size(); i++) {
			if (solution.get(i) == 1 ) {
				count++;
			}
		}
		if(count == TOTAL_PLAYER) {
			return true;
		}
		return false;
	}

}