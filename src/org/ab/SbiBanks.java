package org.ab;

public class SbiBanks extends RbiBanks {

	
	@Override
	public void savings() {
		System.out.println("Saving is 6%");
		
	}
	
	@Override
	public void current() {
		System.out.println("current is 10%");
		
	}
	
	@Override
	public void fixed() {
	System.out.println("fixed is 22%");
		
	}
	
	public static void main(String[] args) {
		
		SbiBanks d=new SbiBanks();
		d.savings();
		d.current();
		d.fixed();
		
		RbiBanks r=new SbiBanks();
		r.savings();
		r.current();
		r.fixed();
	}
	
	
	
}
