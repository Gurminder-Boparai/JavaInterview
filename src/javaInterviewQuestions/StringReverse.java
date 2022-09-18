package javaInterviewQuestions;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="133";
		String rstr="";
		int len=str.length();
		//char a=str.charAt(0);
		for(int i=0;i<len;i++) {
			rstr=str.charAt(i)+rstr;
		}
		System.out.println(rstr);
	}

}
