import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*"Given a string array, each element containing a line of apache log file. Every line starts with an IP address. 
Write a program that returns the IP address which appeared most of the times from the log file."*/
public class IpCountCheck {

	 public static void main(String[] args) 
	    { 
	        final String log = "123.123.123.123 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/wpaper.gif HTTP/1.0\" 200 6248 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
	                           + "123.123.123.123 - - [26/Apr/2000:00:23:47 -0400] \"GET /asctortf/ HTTP/1.0\" 200 8130 \"http:// search.netscape.com/Computers/Data_Formats/Document/Text/RTF\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
	                           + "123.123.123.124 - - [26/Apr/2000:00:23:48 -0400] \"GET /pics/5star2000.gif HTTP/1.0\" 200 4005 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
	                           + "123.123.123.123 - - [26/Apr/2000:00:23:50 -0400] \"GET /pics/5star.gif HTTP/1.0\" 404 1031 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
	                           + "123.123.123.126 - - [26/Apr/2000:00:23:51 -0400] \"GET /pics/a2hlogo.jpg HTTP/1.0\" 200 4282 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"
	                           + "123.123.123.123 - - [26/Apr/2000:00:23:51 -0400] \"GET /cgi-bin/newcount?jafsof3&width=4&font=digital&noshow HTTP/1.0\" 200 36 \"http:// www.jafsoft.com/asctortf/\" \"Mozilla/4.05 (Macintosh; I; PPC)\"\n"; 
	  
	        findIpCount(log); 
	    } 
	 
	 public static void findIpCount(String record) 
	    { 
	        // Creating a regular expression for the records 
	        final String regex = "^(\\S+)";
	        		
	  
	        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE); 
	        final Matcher matcher = pattern.matcher(record); 
	  
	        
	        HashMap<String, Integer> countIP = new HashMap<String, Integer>(); 
	        while (matcher.find()) { 
	  
	            String IP = matcher.group(1); 
	            
	           
	                if (countIP.containsKey(IP)) { 
	                    countIP.put(IP, countIP.get(IP) + 1); 
	                } 
	                else { 
	                    countIP.put(IP, 1); 
	                 
	            } 
	        } 
	  
	        for (Map.Entry entry : countIP.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
	    } 
}
