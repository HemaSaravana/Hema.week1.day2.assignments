package assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="stops";
String str2="kites";
int comp=0;

if(str1.length()==str2.length()) {
	char[] arrStr1=str1.toCharArray();
	char[] arrStr2=str2.toCharArray();
	Arrays.sort(arrStr2);
	Arrays.sort(arrStr1);
	for(int i=0;i<arrStr2.length-1;i++) {
		if(arrStr1[i]!=arrStr2[i]) {
			comp++;
		
		}
		
	}
	if(comp>0) {
		System.out.println("given strings are not an anagram");
	}
	else {
		System.out.println("given strings are  an anagram");
	}
	
		
}
else {
	System.out.println("given strings are not an anagram");
}
	}

}
