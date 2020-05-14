import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeArraysSortedWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: arr1[] = { 3,7,9,12,21}, arr2[] = {6,8,15,18,27}
	//Output: arr3[] = {3,6,7,8,9,12,15,18,21,27}
		
		
		//Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
		
		//Integer[] a={ 1, 3, 4, 5};
		//Integer[] b={2, 4, 6, 8};
		
		Integer[] a={ 3,7,9,12,21};
		Integer[] b={6,8,15,18,27};
		
		List<Integer[]> list=Arrays.asList(a,b);
		List<Integer> finallist=list.stream().flatMap(s->Arrays.stream(s)).sorted().collect(Collectors.toList());
		System.out.println(finallist);
	}

}
