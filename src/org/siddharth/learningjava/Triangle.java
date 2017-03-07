package org.siddharth.learningjava;

public class Triangle {
	
	private String type;
	private int height;
	
	
	
	public int getHeight() {
		return height;
	}
	/***** Constructor for type*****/
	public Triangle (String type){
		this.type = type;
	}
	
	/***** Constructor for height*****/
	public Triangle (int height){
		this.height = height;
	}
	/***** Constructor for type and height*****/
	public Triangle (String type, int height){
		this.type = type;
		this.height = height;
	}
	public String getType() {
		return type;
	}
	/*public void setType(String type) {
		this.type = type;
	}*/
	
	public void draw(){
		System.out.println(getType() + " Triangle drawn of height " + getHeight());
	}

}
