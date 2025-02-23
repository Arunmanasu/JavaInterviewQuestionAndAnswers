package arrays;

public class FindMaxAndMin {

	public static void main(String[] args) {

     int array[] = {1,2,4,7,5,9};
     
         int max = array[0];
     
        for(int i=0; i<array.length; i++) {
        	
        	  if(array[i] > max) {
        		  
              max = array[i];
        		  
        	  }
       
        }
        
        System.out.println("Largest Number :"+max);
	
              int min = array[0];
              
        for(int i=0; i<array.length; i++) {
        	
        	if(array[i] < min) {
        		
        		min = array[i];
        	}
        }

        System.out.println("Smallest Number :"+min);    
        
	}

}
