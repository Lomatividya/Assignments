package assignments;

public class ConvertANegativeNumberToPositiveNumber {
public static void main(String[] args) {
	int a=-40;
	int PositiveNumber;
	if (a<0) {
		System.out.println(a + "is a negative");
	}
	if (a>0) {
		System.out.println(a + "is a positive");
	}
    if (a<0) {
    	PositiveNumber = a*(-1); 
		System.out.println("positive number:" + PositiveNumber);
	}	
	
}
}
