package arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
	
		int [] array = {1,2,3,4,5,8};
		
		int [] d = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			
			         d[i] =  array[i];
			
		}
		
		System.out.println(Arrays.toString(d));
	}

}
