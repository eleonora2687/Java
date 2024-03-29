// Fix Basic Calculator

/* public class Calculator { 
	public static void main(String[] args){
		System.out.println(basicCalculator(2, '+',  4) );
		System.out.println(basicCalculator(6, '-', 5)) ;
		System.out.println(basicCalculator(12, '/', 3));
		System.out.println(basicCalculator(3, '*', 4));
		System.out.println(basicCalculator(1, '/', 0) );
		System.out.println(basicCalculator(1, 'x', 0));
		
	}

	public static Object basicCalculator(int a, String o, int b) {
		
		if(o == "+") return a + b;
		else if(o == "-") return a - b;
		else if(o == "/" && b != 0) return a / b;
		else if(o == "*") return a * b;
		else return null;
		
	}
} */


// Basic Arithmetic Operations

/* public class Calculator { 
	public static void main(String[] args){
		System.out.println(operation("1",  "2",  "add" ));
		System.out.println(operation("4",  "5",  "subtract") );
		System.out.println(operation("6",  "3",  "divide") );
		
				
	}

	public static int operation(String a, String b, String op) {
		try{
		
		int i=Integer.parseInt(a);
		int j=Integer.parseInt(b);
		if (op=="add") 
			return i+j;
		 else if(op=="subtract")
			return i-j;
		 else if(op=="divide")
			return i/j;
			else if(op=="multiply")
			return i*j;
		
		}
		catch(ArithmeticException e)
			{ return Integer.MIN_VALUE;
			}
		return 0;
	
	}
} */

// Quadratic Equation

/* public class Calculator { 
	public static void main(String[] args){
		System.out.println(quadraticEquation(1, 2, -3));
		System.out.println(quadraticEquation(2, -7, 3) );
		System.out.println(quadraticEquation(1, -12, -28));
		
				
	}

	public static int quadraticEquation(int a, int b, int c) {
	 	
		double d=Math.pow(b, 2)-4*a*c;
		int result=(int)((-b+Math.sqrt(d))/2);
		return result;

	}
} */

// Simulate the Game "Rock, Paper, Scissors"

/* public class Calculator { 
	public static void main(String[] args){
		System.out.println(rps("rock", "paper"));
		System.out.println(rps("paper", "rock"));
		System.out.println(rps("paper", "scissors"));
		System.out.println(rps("scissors", "scissors"));
		System.out.println(rps("scissors", "paper"));

		
				
	}

	public static String rps(String s1, String s2) {

		String s3="Player 1 wins", s4="Player 2 wins", s5="TIE";
		if (s1==s2) {
			return s5;
		} else if(s1=="rock" && s2=="scissors"){
			return s3;
		}	
		else if(s2=="rock" && s1=="scissors"){
			return s4;
		}	
		else if(s1=="rock" && s2=="paper"){
			return s4;
		}
		else if(s2=="rock" && s1=="paper"){
			return s3;
		}
		else if(s1=="scissors" && s2=="paper"){
			return s3;
		}
		else if(s2=="scissors" && s1=="paper"){
			return s4;
		}
		return null;
	}
} */


// The Empty Square Sequence

public class Calculator { 
	public static void main(String[] args){
		System.out.println(emptySq(1));
		System.out.println(emptySq(3) );
		System.out.println(emptySq(10));
					
	}

	public static int emptySq(int step) {
		
		return (int)Math.pow(2*step,2)-4*step;
	}
}