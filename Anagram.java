import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="STOP";
		String s2="TOPS";
		
		List<Character> charList=s1.chars().mapToObj(e->(char)e).sorted().collect(Collectors.toList());
		List<Character> charlist1=s2.chars().mapToObj(e->(char)e).sorted().collect(Collectors.toList());
		if(charList.containsAll(charlist1)){
			System.out.println("given are anagram");
		}
		else {
			System.out.println("given not anagram");
		}
		
	}

}
