package ex_20022024;

public class Lab053 {

	public static void main(String[] args) { 
		// 2 ways to create string
String name = "Pramod";  //Assignment Operators (1)
//   String name2 = new String(original:"Promod");  //New is Operator (2)

//both of the string are saved in JVM in different ways

System.out.println(name);     //or
System.out.println("your name is --> " + name);
System.out.printf("\n -- your name is --> %s" , name);

System.out.println(name.length());


	}

}
