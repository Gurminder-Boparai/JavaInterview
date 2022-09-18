package javaInterviewQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
			count=count+1;
			}	
		}
		System.out.println(count);
		if(count>0) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
	}
}
