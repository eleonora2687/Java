import java.sql.Array;
import java.util.*;

/* public class Program {
    public static void main(String[] args){
        System.out.println(Program.sum(5, 6));
        
    }
    public static boolean returnTrue() {
      return true;
    }
    public static int sum(int a, int b) {
      return a+b;
    }
}

 */

/* public class Program {
    public static void main(String[] args){
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));
    }

	public static int solutions(int a, int b, int c) {
        if (Math.pow(b,2)-4*a*c>0) {
            return 2;
        } else if(Math.pow(b,2)-4*a*c==0) {
            return 1;
        }
        return 0;
		
  }
} */


/* public class Program {
    public static void main(String[] args){
        arrayOfMultiples(7, 5);
        arrayOfMultiples(12, 10);
        arrayOfMultiples(17, 6);
    }

	public static int[] arrayOfMultiples(int num, int length) {
        int intArray[];
        intArray = new int[length];
            for(int i=0;i<length;i++)
            {
                        intArray[i]=num*(i+1);
                        System.out.println(intArray[i]);
            }


        
            return intArray;
	}
} */

/* public class Program {
    public static void main(String[] args){
        otherSides(1);
        otherSides(12);
        otherSides(2);
        otherSides(3);
    }

	public static double[] otherSides(int n) {
        double intArray[];
        intArray = new double[2];
        intArray[0]=2*n;
        intArray[1]=n*Math.sqrt(3);

        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%.2f ",intArray[i]);
        }
        return intArray;
    }
} */


/* public class Program {
    public static void main(String[] args){
        System.out.println(PrimeNumberInRange(10, 15));
        System.out.println(PrimeNumberInRange(62, 66));
        System.out.println(PrimeNumberInRange(3, 5));
            }

    public static boolean PrimeNumberInRange(int n1, int n2) {
        boolean isPrime=false;

        for (int i = n1; i <= n2; i++) {
            isPrime=true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime) {
                break;
            }
        }
        return isPrime;
		
    }
} */


public class Program {
    public static void main(String[] args){
        int[] intArray = {2, 8, 7, 5};
        System.out.println(warOfNumbers(intArray));
        int[] intArray1 ={12, 90, 75};
        System.out.println(warOfNumbers(intArray1));
        int[] intArray2={5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(warOfNumbers(intArray2));
            }
            public static int warOfNumbers(int numbers[]){
		    int sumOfEven=0;
            int sumOfOdd=0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]%2==0) {
                    sumOfOdd+=numbers[i];
                } else {
                    sumOfEven+=numbers[i];
                }
            }return Math.abs(sumOfOdd-sumOfEven);
            }
}
