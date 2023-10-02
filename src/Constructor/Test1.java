package Constructor;

public class Test1 
{
	 String Cricketer;
	 int Runs;
	 Test1()
	 {
		 
	 }
	
	 Test1(String C1,int R1)
	 {
		 this.Cricketer=C1;
		 this.Runs=R1;		 
	 }
	public static void main(String[] args)
	{
		Test1 t1=new Test1("Rohit",262);
		Test1 t2=new Test1("shubhman",124);
		Test1 t3=new Test1("Virat",100);
		
		Test1 t4=new Test1();
		
		
		System.out.println("Info For T1");
		System.out.println("Cricketer="+t1.Cricketer+"\nRuns="+t1.Runs);
		
		System.out.println("Info For T2");
		System.out.println("Cricketer="+t2.Cricketer+"\nRuns="+t2.Runs);
		
		System.out.println("Info For T3");
		System.out.println("Cricketer="+t3.Cricketer+"\nRuns="+t3.Runs);
	}

}
