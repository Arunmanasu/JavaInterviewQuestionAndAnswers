package arrays;

public class ArraySearch {

	public static void main(String[] args) {
		
		int [] array = {1,2,4,5,6,7};
		
		int seachValue = 5;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]==seachValue) {
				System.out.println("Search Value :-"+array[i]);
			}
		}

	}

}
