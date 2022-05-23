Print 1 to 10 numbers except 4th and 7th number

public static void main(String[] args) {
		
		int i = 1;
		while (i <= 10) {
			if ((i != 4) && (i != 7)) {
				System.out.println(i);	
			}
			i++;
		}
		
	}