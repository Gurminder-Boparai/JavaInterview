package javaInterviewQuestions;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,8,1,9,2};
		System.out.println("Initial Array:");
		for(int i:arr) {
			System.out.print("   "+i);	
		}
		int size=arr.length;
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//System.out.print("    "+arr[i]);
			
		}	
		System.out.println("");
		System.out.println("Sorted Array:");
		for (int i : arr) {
			System.out.print("   "+i);		
		}	
		System.out.println("");
		System.out.println("Second Highest: "+arr[size-2]);
		System.out.println("Third Highest: "+arr[size-3]);
	}
}

