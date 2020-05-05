import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
       int n1= in.nextInt();
       int n2=n1%10;
       int n3=n1/10;
       int n4=n3%10;
       int sum=n4+n2;
       System.out.println(sum);
	}
}