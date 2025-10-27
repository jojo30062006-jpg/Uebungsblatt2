package h2;

public class H2_main {
	public static void main(String[] args) { 
		
		int i = 20;
		int j = 23;
		int k = 3;
		int min = 9;
		int max = 8;
				
		if (i < j && i < k) {
			min = i;
		}
		if (k < j && k < j) {
			min = k;
		}
		if (j < i && j < k) {
			min = j;
		}
		
System.out.println ("Minimum: " + min);
		if (i > j && i > k) {
			max = i;
}
		if (k > j && k > j) {
			max = k;
}
		if (j > i && j > k) {
			max = j;
}

System.out.println ("Maximum: " + max);
		
	}
}