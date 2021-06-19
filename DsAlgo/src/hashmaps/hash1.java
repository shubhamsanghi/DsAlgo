package hashmaps;
import java.util.*;

public class hash1 
{

	public static void main(String[] args) 
	{
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("one", 1);
		numbers.put("three", 3);
		numbers.put("seven", 7);		
		numbers.put("nine", 9);

		System.out.println(numbers);
		
		numbers.put("one", 11);
		System.out.println(numbers);
		
		System.out.println(numbers.get("nine"));
		System.out.println(numbers.get("six"));
		
		System.out.println(numbers.containsKey("one"));
		
		System.out.println("\n");
		
		System.out.println(getHash("one"));
	}

		public static int getHash(String s)
		{
			int hash = 0;
			for(int i=0; i<s.length();i++)
			{
				hash += s.charAt(i);
			}
			return hash;
		}
		

}
