package miscellaneous;
import java.util.*;

public class IncomeTax {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("enter CTC");
		double ctc = sc.nextDouble();
		ctc *= 100000;
		double tax = 0,pm = ctc;
		if(ctc >= 1500000)
		{
			tax += (ctc-1500000) * 0.3;
			ctc = 1500000;
		}
		if(ctc >= 1250001)
		{
			tax += (ctc-1250001) * 0.25;
			ctc = 1250001;
		}
		if(ctc >= 1000001)
		{
			tax += (ctc-1000001) * 0.2;
			ctc = 1000001;
		}
		if(ctc >= 750001)
		{
			tax += (ctc-750001) * 0.15;
			ctc = 750001;
		}
		if(ctc >= 500001)
		{
			tax += (ctc-500001) * 0.1;
			ctc = 500001;
		}
		if(ctc >= 250001)
		{
			tax += (ctc-250001) * 0.05;
			ctc = 250001;
		}
		pm = pm-tax;
		System.out.println(pm/12000 + "k");;
	}

}
