package ex_20022024;

public class Lab051 {
	
	public static void main(String[] args) {
		
		int a = 87;
		long b = 91;
		String s1 = "KK";
		String s2 = "VV";
		System.out.println(s1+s2+a+b);    //KKVV8791  (normal concatenation)
		System.out.println(s1+s2+(a+b));   //KKVV178  (BODMAS method of maths)
		
	}

}
