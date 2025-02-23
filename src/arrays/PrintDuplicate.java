package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintDuplicate {

	public static void main(String[] args) {
	
		int[] array = {1,1,2,2,4,5,6};
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i]==array[j]) {
								
		System.out.println("Duplicate value:-"+array[i]);
				
				}
				
			}
		}
		   HashSet<Integer> seen = new HashSet<>();
		for(int num : array) {		
			if(seen.contains(num)) {
				
				System.out.println("Duplicate Number:-"+num);
			}else {
				seen.add(num);
			}
			
		}

	}

}
