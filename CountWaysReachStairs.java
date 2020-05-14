/*"A guy uses elevator to reach his flat. But unfortunately elevator is not working today and he became sad. 
Suddenly God came and made the stairs magical, such that he can jump on it in a magical way. Initially he can take 1 or 2 steps. 
If he jumps “x” steps at a time then in the next step he can climb either x or x+1or x+2…… steps depending on his choice 
and he must reach exactly on n'th step. Print all possisblities to reach his flat by staircase." */
public class CountWaysReachStairs {
	 static int countWaysUtil(int n, int m) 
	    { 
	        int res[] = new int[n]; 
	        res[0] = 1; 
	        res[1] = 1; 
	        for (int i = 2; i < n; i++) { 
	            res[i] = 0; 
	            for (int j = 1; j <= m && j <= i; j++) 
	                res[i] += res[i - j]; 
	        } 
	        return res[n - 1]; 
	    } 
	  
	    // Returns number of ways to reach s'th stair 
	    static int countWays(int s, int m) 
	    { 
	        return countWaysUtil(s + 1, m); 
	    } 
	  
	    // Driver method 
	    public static void main(String[] args) 
	    { 
	        int s = 4, m = 2; 
	        System.out.println("Number of ways = " + countWays(s, m)); 
	    } 
}
