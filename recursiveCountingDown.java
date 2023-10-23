package SS;

public class recursiveCountingDown {

	 public static void main(String[] args) {
	        int startNumber = 10;
	        countdown(startNumber);
	    }
	 
	 public static int countdown(int startNumber) {
		        if (startNumber <= 0) {
		            return 0;
		        } else {
		            System.out.println(startNumber);
		           return countdown(startNumber - 1);
		        }
		    }
	 }

