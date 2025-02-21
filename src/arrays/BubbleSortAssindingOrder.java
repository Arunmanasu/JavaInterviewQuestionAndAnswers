package arrays;

import java.util.Arrays;

public class BubbleSortAssindingOrder {

	public static void main(String[] args) {

			
				   int[] array = {1, 2, 8, 4, 5, 6, 3};

				   for(int i=0; i<array.length; i++) {
					   
					   for(int j=i+1; j<array.length; j++) {
						   
						   if(array[i] > array[j]) {
							   
							int temp = array[i];
							array[i] = array[j];
							array[j] = temp;
							   
						   }
						   
				   }
				   
			   }
				   
				   System.out.println(Arrays.toString(array));
		   }

		  }
