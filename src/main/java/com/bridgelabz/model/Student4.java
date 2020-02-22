package com.bridgelabz.model;

public class Student4 {
	// Paper4 is a interface Reference
	private Paper4 Paper;// sciencePaper is loaded in beans file // new Science4();

	public void setPaper(Paper4 paper) {
		Paper = paper;
	}

//	public void setSciencePaper(Science4 sciencePaper) {
//		this.sciencePaper = sciencePaper;
//	}
//
	public void paper() {
//		sciencePaper.sciencePaper(); // call the Math3.class & print the Data
		Paper.paper(); 
	}
	
}
