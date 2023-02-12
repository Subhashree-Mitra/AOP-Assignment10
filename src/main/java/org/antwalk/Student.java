package org.antwalk;

public class Student {
	
	private String name;
	private double engMarks;
	private double hindiMarks;
	private double mathMarks;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEngMarks() {
		return engMarks;
	}

	public void setEngMarks(double engMarks) {
		this.engMarks = engMarks;
	}

	public double getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(double hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public double getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(double mathMarks) {
		this.mathMarks = mathMarks;
	}

	public double avgMark() {
		return ((engMarks + hindiMarks + mathMarks)/3);
	}
	
	public void showResult() {
		//System.out.println("------------------------------");
		System.out.println("Name: " + name);
		System.out.println("English: " + engMarks);
		System.out.println("Hindi: " + hindiMarks );
		System.out.println("Maths: " + mathMarks);
		System.out.println("Average Mark is: " + avgMark());
		//System.out.println("------------------------------");

	}
	
}
