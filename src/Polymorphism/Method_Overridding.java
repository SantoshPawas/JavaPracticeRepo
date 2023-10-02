package Polymorphism;

public class Method_Overridding extends Son 
{
	public static void main(String[] args)
	{
		Son s1=new Son();
		s1.Car();			//call car() of son class
		s1.Money();			// call money() of son class
		s1.Home();			// call home() of father class
		s1.Bike();			// call Bike() of son class
	}

	

}
