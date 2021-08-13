package assignments;

public class Calculator {
	// TODO Auto-generated method stub
			//a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
			//(b) sub(int num1, int num2), it should return subtraction of of num1-num2
			//(c) mul(double num1, double num2), it should return product of num1 * num2
			//(d) divide(float num1, float num2), it should return division of num1 / num2
			
	public void add() {
		int addNum1=20 ;
		int addNum2 =40;
		int addNum3=60;
		int sum=addNum1+addNum2+addNum3;
		System.out.println(sum);
	}
	
	public void sub() {
		int subNum1=50;
		int subNum2=25;
		int subtract=subNum1-subNum2;
		System.out.println(subtract);
	}
	
	public void mul() {
		double num1=25.56d;
		double num2=6.8d;
		double num3=num1*num2;
		System.out.println(num3);
	}
	
	public void div() {
		float dDiv1=123.45f;
		float dDiv2=25.34f;
		float ans=dDiv1/dDiv2;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		
	Calculator cal= new Calculator();
	cal.add();
	cal.sub();
	cal.mul();
	cal.div();
			
		}


	}


