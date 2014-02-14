package io.jimmyliao.practice;

public class fibonacci {
	public static int count = 0;
	
	public fibonacci() {
		super();
	}

	public static long fib(int n) {
		count++;
		
		if(n<=1) 
			return n;
		return ( fib(n-1) + fib(n-2) );
	}

	public static void main(String[] args) {
		if(args[0] != null){
			int target = Integer.parseInt(args[0]);
			for(int i=0; i<target; i++)
			{
				System.out.println(i+ ", [fib]="+fib(i)+", count="+count);
			}
		}
	}

}
