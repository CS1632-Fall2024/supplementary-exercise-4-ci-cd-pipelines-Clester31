package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int id;
	private String name;
	private boolean rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.rented = false;
	}

	public void rentCat() {
		// TODO: Fill in
		this.rented = true;
	}

	public void returnCat() {
		this.rented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;
	}

	public String getName() {
		// TODO: Fill in
		return this.name;
	}

	public int getId() {
		// TODO: Fill in
		return this.id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return rented;
	}

	public String toString() {
		return "ID " + this.id + ", " + this.name;
	}

}