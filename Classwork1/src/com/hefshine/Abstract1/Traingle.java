package com.hefshine.Abstract1;

public class Traingle extends Shape {

	Traingle()
	{
		super();
		System.out.println("defailt tran");
	}
	
	@Override
	public void numberofsize() {
		// TODO Auto-generated method stub
		
		System.out.println("3 side of trangle");
		
	}
	
	public static void main(String[] args) {
		
		
		Shape sh=new Traingle();
		sh.numberofsize();
	}

}
