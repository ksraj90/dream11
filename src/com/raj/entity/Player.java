package com.raj.entity;
public class Player {
	
	public Player() {

	}

	public Player(String name, String team, double point, String role) {
		super();
		Name = name;
		this.role = role;
		this.point = point;
		this.team = team;
	}

	private String Name;
	private String role;
	private double point;
	private String team;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
