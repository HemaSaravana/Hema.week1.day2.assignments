package assignments;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "go go go";
					char[] arrStr1=str.toCharArray();
					int len=arrStr1.length;
					for(int i=0;i<len;i++) {
						int count=1;
						for(int j=i+1;j<len;j++) {
							if(arrStr1[i]==arrStr1[j])
							{
								count++;
								arrStr1[j]=0;
							}
						}
						if(arrStr1[i]!=0) {
							System.out.println(arrStr1[i]+": "+count);
						}
					}
					
					
	}

}
