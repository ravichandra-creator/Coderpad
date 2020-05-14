import java.util.LinkedHashMap;
import java.util.Map;
/* String Manipulation Program - write a test case which would take a string as input like 'aabccd' and 
print the maximum occurrence of a string in the format a=2,b=1,c=2,d=1 */
public class StringManupulation {
	public static void firstnonRepeated(String word){
		System.out.println(word);
    	LinkedHashMap<Character,Integer> hashmap=new LinkedHashMap<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(hashmap.containsKey(c))
            hashmap.put(c,hashmap.get(c)+1);
            else{
                hashmap.put(c,1);
            }
          //  System.out.println(hashmap);
                    
           // return 0;       
    }
       // int t=1;
        for(Map.Entry<Character,Integer> entry:hashmap.entrySet()){
			/*
			 * if(entry.getValue()==1){ //System.out.print(word) if(t==2) {
			 * System.out.println(entry.getKey()); // break;
			 * 
			 * } t++;
			 * 
			 * }
			 */
        	
        	System.out.println(entry.getKey()+"="+entry.getValue());
            
        }
        
        }
	
	public static void main (String[] args) 
	{
		// your code goes here
	//	Input : { "array", "apple", "rat"}
    //Output: y,a,r
    
    String s[]={"aabccd","apple","rat"};   
   // Map<>
    for(String ss:s){
         // System.out.println(ss);
       firstnonRepeated(ss);
     
    }

}
}
