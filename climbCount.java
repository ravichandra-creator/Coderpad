import java.util.Scanner;
//If a child is climbing a stair case with “n” steps, find the maximum number of possibilities (how many different ways he can climb the stair case)

public class climbCount {

	static int ways(int n, int j) 
	{ 
		if (n <= 1) 
			return n; 
		int res = 0; 
		for (int i = 1; i<=j && i<=n; i++) 
			res += ways(n-i, j); 
		return res; 
	} 

	static int diffWays(int n, int i) 
	{ 
		return ways(n+1, i); 
	} 

	public static void main (String args[]) 
	{ 
		int c;
		System.out.println("Enter number of steps:");
		Scanner scanner = new Scanner(System.in);
		c = scanner.nextInt();
		scanner.close();
		int i = 2; 
			System.out.println("Number of  different ways = "+ diffWays(c,i)); 
	} 
}
