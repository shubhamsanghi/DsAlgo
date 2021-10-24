package miscellaneous;

public class Demo {
	  public static void main(String[] args) {
	    String str = "This is a 999 sampLE 123.45 inPut for the true assignMENT.";
	    String[] words = str.split(" ");
	    int i = 0;
	    for (String s : words) {
	      words[i] = getAnswer(s).toString();
	      i++;
	    }
	    System.out.println();
	    for (String s : words) {
	      System.out.print(s + " ");
	    }
	    System.out.println();
	    System.out.println();
	  }

	  public static Object getAnswer(String str) {
	    try {
	      int n = Integer.parseInt(str);
	      // is int
	      int sum;
	      for (sum = 0; n > 0; sum += n % 10, n /= 10)
	        ;
	      String newsum = Integer.toString(sum);
	      return str.concat("=" + newsum);
	    } catch (NumberFormatException e) {
	      // not int
	      try {
	        Float.parseFloat(str);
	        // is float
	        String x = "";
	        for (int i = 0; i < str.length(); i++) {
	          char ch = str.charAt(i);
	          if (ch == '.') {
	            x = x + ".";
	          } else {
	            int num = ch - '0';
	            num = num * 2;
	            x += Integer.toString(num);
	          }
	        }
	        return str.concat("=" + x);
	      } catch (NumberFormatException ex) {
	        // not float
	        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
	          // is boolean
	          boolean x = Boolean.parseBoolean(str);
	          x = !x;
	          String newx = Boolean.toString(x);
	          return str.concat("=" + newx);
	        } else {
	          // not boolean
	          // is string
	          StringBuffer sb = new StringBuffer(str);
	          int ln = sb.length();
	          for (int i = 0; i < ln; i++) {
	            Character c = sb.charAt(i);
	            if (Character.isLowerCase(c))
	              sb.replace(i, i + 1, Character.toUpperCase(c) + "");
	            else
	              sb.replace(i, i + 1, Character.toLowerCase(c) + "");
	          }
	          return sb;
	        }
	      }
	    }
	  }
	}