package problems;
import java.util.*;

class longestPalindromeSubstring {
    public String longestPalindrome(String s) 
    {
        if(s.length() == 1 || s.length() == 0)
            return s; 
        int m =0;
        String ml = "";
        int i = 0; 
        for(i=0;i<s.length()-1;i++)
        {
            String t = palin(i,i,s);
            if(t.length() >= m)
            {
                m = t.length();
                ml = t;
            }
            t = palin(i,i+1,s);
            if(t.length() >= m)
            {
                m = t.length();
                ml = t;
            }
            
        }
        return ml;
        
    }
    public String palin(int j,int k, String s)
    {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k))
        {
		    j--;
		    k++;
	
        }
        s = s+" ";
        return s.substring(j+1,k);
            
        
        
    }
}