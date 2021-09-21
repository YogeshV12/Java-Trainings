



public class sample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Everyone...");
		
		int arr[] = {5,4,6,3,7,4};
		int sumall=0;
		
		for(int i=0; i<6; i++) {
			sumall += arr[i];
		}
		
		System.out.println(sumall);
		
		int fib =0, fib1 =1;
		int n=10;
		
		while(n-- > 0) {
			int ans = fib1 + fib;
			fib = fib1;
			fib1 = ans;
			System.out.println(ans);
		}
		
		
	}

}
