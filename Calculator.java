package assignments;

public class Calculator {
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
    }
	public void sub(int num1, int num2) {
		System.out.println(num1-num2);
    }
	public void mut(double num1, double num2) {
		System.out.println(num1*num2);
	}
	public void div(float num1, float num2) {
		System.out.println(num1/num2);
	}
public static void main(String[] args) {
	Calculator cal=new Calculator();
	cal.add(10,4,8);
	cal.sub(14, 6);
	cal.mut(623d, 415d);
	cal.div(16.2f, 4.1f);
}
}