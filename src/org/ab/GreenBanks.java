package org.ab;

public class GreenBanks implements HdfcBanks, AxisBanks {
//child
	@Override
	public void savings() {
		System.out.println("saving is 55%");
		
	}

	@Override
	public void current() {
		System.out.println("current is 76%");
		
	}

	@Override
	public void fixed() {
		System.out.println("88%");
		
	}
	private void Loan() {
		System.out.println("Loan is 23%");

	}
public static void main(String[] args) {
	
	GreenBanks d3=new GreenBanks();
	d3.savings();
	d3.current();
	d3.fixed();
	d3.Loan();
	
	HdfcBanks d4=new GreenBanks();
	d4.fixed();
	d4.current();
	d4.savings();
	
	AxisBanks d5=new GreenBanks();
	d5.savings();
	d5.current();
	d5.fixed();
}
	
}
