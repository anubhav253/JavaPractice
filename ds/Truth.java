import java.util.*;
class Truth{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int array[]=new int[1000000];
		for(int i=0;i<n;i++){
			array[i]=scanner.nextInt();
		}
		
		System.out.println(getMinValue(array));
    	
        
    }
   public static int getMinValue(int[] array) {
    	int minValue = array[0];
    	for (int i = 1; i < n; i++) {
        	if (array[i] < minValue) {
            	minValue = array[i];
            }
        }
        return minValue;
    }
    
} 