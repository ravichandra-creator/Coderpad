import java.util.Arrays;

public class CommonElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Arrays.asList(5,2,1,4,3).stream().sorted().forEach(e->{
			if(Arrays.asList(1,2,5,7,9).contains(e) && Arrays.asList(1,3,4,5,8).contains(e)) {
				System.out.println(e);
			}
		});
					
		
	
	}

}
