package com.hefshine.Inte;

public class Pulsar implements Bike {

	
	@Override
	public void spped() {
		System.out.println(color);
		System.out.println("The speed is 1oo km/hour");
		
	}
	
	public static void main(String[] args) {
		
		Pulsar p=new Pulsar();
		p.spped();
	}

	@Override
	public void Design() {
		// TODO Auto-generated method stub
	
	}

}
