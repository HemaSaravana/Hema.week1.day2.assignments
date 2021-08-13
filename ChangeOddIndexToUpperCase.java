package assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		
		String test="changeme";
		int len=test.length();
		char[] cArray=test.toCharArray();
		for(int i=0;i<=len-1;i++) {
			if(i%2!=0) {
				cArray[i]=Character.toUpperCase(cArray[i]);
			}
			
			}
		System.out.println(cArray);
		}
		
		
	}


