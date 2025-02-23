package arrays;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
	
		
		int array[] = {1,2,3,6,9,8,7};
		
		for(int i=array.length-1; i>=0; i--) {
			
			System.out.print(array[i]+",");
		}

	}

}
