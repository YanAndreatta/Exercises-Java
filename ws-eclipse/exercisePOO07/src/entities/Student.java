package entities;

public final class Student {
	private String name;
	private double notes;
	
	
	// Constructor
	public Student() {
		this.setName(null);
		this.setNote(0);
	}
	
	//Methods private
	public void notes(double note1, double note2, double  note3) {
		double notes = note1 + note2 + note3;
		this.setNote(notes);
	}
	
	public double missingPoints() {
		if(this.getNote() < 60f) {
			return 60 - this.getNote();
		} else {
			return 0f;
		}
	}
	
	//Getters and Setters		
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getNote() {
		return notes;
	}
	
	
	public void setNote(double note) {
		this.notes = note;
	}
	
	
}
