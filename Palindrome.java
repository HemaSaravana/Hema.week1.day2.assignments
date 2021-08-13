package assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="madam";
		String rev="";
		int len=str.length();
		
		System.out.println("String length:"+len);
		char[] charArray=str.toCharArray();
	
		for(int i=len-1;i>=0;i--) {
			rev=rev+charArray[i];
			
			
		}
		System.out.println("Original string is:"+str);
		System.out.println("Reverse string is:"+rev);
		if(str.equals(rev)) {
			System.out.println("The string is Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
