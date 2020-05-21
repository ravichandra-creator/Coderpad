import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Find the median of two sorted arrays of different size. 

Example:
 Input : 
Array 1: 2 3 6 7 9 
Array 2: -1 4 8 10  = 5 

Output : 6

Hint: The final sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10,12 The 5th element of this array is 6.

 */
public class MedianOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a= {2,3,6,7,9};
		Integer[] b= {-1, 4, 8 ,10};
				
		  List<Integer[]> list=Arrays.asList(a,b);
		  
		  List<Integer> flatList=list.stream().flatMap(s->Arrays.stream(s)).sorted().collect(Collectors.toList());
		  int size=flatList.size();
		  System.out.println(flatList);
		//  System.out.println(size);
		  Number num;
		  int val=0;
		  if(size%2==0) {
			   val=size/2;
			  num=Float.valueOf((flatList.get(val-1)+flatList.get(val)))/2;
		  }
		  else {
			  val=(size/2);
			  num=flatList.get(val);
		  }
		  System.out.println(" median "+num);
		
	}

}
