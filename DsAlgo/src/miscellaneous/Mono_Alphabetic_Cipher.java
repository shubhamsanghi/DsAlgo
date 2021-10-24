package miscellaneous;
import java.util.Scanner;

public class Mono_Alphabetic_Cipher {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.nextLine();
		String s1 = "";
		char normalChar[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		char codedChar[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
		
		for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {


                if (s.charAt(i) == normalChar[j])
                {
                    s1 += codedChar[j];
                    break;
                }

                
                if (s.charAt(i) < 'a' || s.charAt(i) > 'z')
                {
                    s1 += s.charAt(i);
                    break;
                }
            }
        }
		System.out.println(s1);
	}

}

