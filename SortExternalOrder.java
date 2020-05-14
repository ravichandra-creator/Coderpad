import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortExternalOrder {

	public static void main(String args[]) {
		List<String> list=new ArrayList<>();
		list.add("Ajay");
		list.add("Raja");
		list.add("Kesav");
		list.add("List");
		list.add("Set");
		list.add("Elephant");
		list.add("Drone");
String str="TESARDLK";
	//	String str="EDSRALK";
List<Character> charList=str.chars().mapToObj(e->(char)e).collect(Collectors.toList());

charList.forEach(c->{
	list.forEach(l->{
		if(l.startsWith(String.valueOf(c))) {
			System.out.println(l);
		}
	});
});

	}
	
}
