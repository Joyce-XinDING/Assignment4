import java.util.Scanner;
public class Fibonacci {
public String series(int a) {
	// no need to use array to save every number, since you just want to print them.
	// so actually use 3 parameters can finish that, it save the space complexity to O(1) not O(n).
	int arr[] = new int[200];
	arr[0] = arr[1] = 1;
	for (int i = 2; i < arr.length; i++) {
	arr[i+1] = arr[i - 1] + arr[i]; 
	System.out.print("\n"+String.valueOf(arr[i+1]));
	arr[i+2]=arr[i]+arr[i+1];
	if(a<arr[i+2]){
		break;
	}
	}
	// if you do not need to print out anything, why not change the return type to void?
	return null;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number:");
		Scanner input=new Scanner(System.in);
		int enter=input.nextInt();
		Fibonacci fib= new Fibonacci();
		fib.series(enter);
	}

}
