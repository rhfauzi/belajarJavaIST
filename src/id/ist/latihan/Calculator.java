package id.ist.latihan;

public class Calculator {
	private int a,b;
	private double c,d;

	//method overloading dengan perbedaan tipe data parameter
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(double c,double d) {
		System.out.println(c+d);
	}

	public static void main(String args[]){
		Calculator obj=new Calculator();
		obj.sum(10.5,10.5);
		obj.sum(20,20);
	}
}
