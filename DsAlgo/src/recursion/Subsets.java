package recursion;

public class Subsets 
{
	static void solve(String s, String o)
	{
		if(s.length() == 0)
		{
			System.out.println(o);
			return;
		}
		String o1 = o;
		String o2 = o;
		
		o1 = o1 + s.charAt(0) ;
		s = s.substring(1);
		
		solve(s,o1);
		solve(s,o2);

	}

	public static void main(String[] args) 
	{
		String s = "Shubham";
		String o = "";
		solve(s,o);


	}

}
