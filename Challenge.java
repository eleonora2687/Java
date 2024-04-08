/* public class Challenge {

    public static void main(String[] args) {
        
        
        System.out.println(cons(new int[]{5, 1, 4, 3, 2}));
        System.out.println(cons(new int[]{55, 59, 58, 56, 57}));
        System.out.println(cons(new int[]{-3, -2, -1, 1, 0}));
        System.out.println(cons(new int[]{5, 1, 4, 3, 2, 8}));
        System.out.println(cons(new int[]{5, 6, 7, 8, 9, 9}));
        System.out.println(cons(new int[]{5, 3}));


    }

	public static boolean cons(int[] arr) {

        quickSort(arr, 0, arr.length-1);
        boolean consecutive=true;
		
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]!=arr[i]+1) {
                consecutive=false;
                break;
            }
        }
        if (consecutive==true) {
            return true;
        } else {
            return false;
        }
	}

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
 
 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
 
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
 
 
        return i + 1;
    
}
} */


// Recursion: Harshad Number

/* public class Challenge {

    public static void main(String[] args) {
        System.out.println(isHarshad(171 ));
        System.out.println(isHarshad(481) );
        System.out.println(isHarshad(89) );
        System.out.println(isHarshad(516) );
        System.out.println(isHarshad(200) );

    }

        public static boolean isHarshad(int n) {
		int sum = sumOfDigits(n);
        return n % sum == 0;
	}

    public static int sumOfDigits(int number)
    {
        if (number < 10) {
            return number;
          } 
        else{
            return (number % 10) + sumOfDigits(number / 10);
    }
    }

	

    
    
} */


/* public class Challenge {

    public static void main(String[] args) {
        System.out.println(largestGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
        System.out.println(largestGap(new int[] {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}));
        System.out.println(largestGap(new int[] {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}));
        System.out.println(largestGap(new int[] {21, 28, 0, 5, 11, 6, 17, 25, 2, 19}));
        System.out.println(largestGap(new int[] {26, 17, 4, 25, 29, 26, 8, 30, 4, 20, 2, 7, 29, 7, 20, 30, 23, 5}));
        System.out.println(largestGap(new int[] {12, 13, 17, 20, 23, 25, 29, 26, 12, 7, 9}));

    }

    public static int largestGap(int[] numbers) {
		quickSort(numbers, 0, numbers.length-1);

        int gap=numbers[1]-numbers[0];
        for (int i = 1; i < numbers.length-1; i++) {
            if (numbers[i+1]-numbers[i]>gap) {
                gap=numbers[i+1]-numbers[i];
            }
        }return gap;
	}

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
 
 
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    
}

}  */

/* import java.util.*;

public class Challenge
{
    public static void main(String args[]) {
        
    
        System.out.println(sortByLength("Hello my friend"));
        System.out.println(sortByLength("Three can keep a secret, if two of them are dead"));
        System.out.println(sortByLength("To be or not to be, that is the question."));
        System.out.println(sortByLength("I have a dream"));
        System.out.println(sortByLength("This is the end"));

}
public static String sortByLength(String str)
{
            int len = str.length();
            String ipStr = (str.charAt(0)) + str.substring(1, len);
            StringTokenizer st = new StringTokenizer(ipStr);
            int wordCount = st.countTokens();
            String strArr[] = new String[wordCount];

            for (int i = 0; i < wordCount; i++) {
                strArr[i] = st.nextToken();
            }

            for (int i = 0; i < wordCount - 1; i++) {
                for (int j = 0; j < wordCount - i - 1; j++) {
                    if (strArr[j].length() == strArr[j + 1].length()) 
                    {
                        int result=strArr[j].compareToIgnoreCase(strArr[j + 1]);
                        if (result>0) {
                            String t = strArr[j];
                            strArr[j] = strArr[j+1];
                            strArr[j+1] = t;
                    }

                    }
                    else if (strArr[j].length() > strArr[j + 1].length()) {
                        String t = strArr[j];
                        strArr[j] = strArr[j+1];
                        strArr[j+1] = t;
                    }
                }
            }

        strArr[0] = strArr[0].charAt(0) + strArr[0].substring(1);
                        

            
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < strArr.length; i++) {

                        
                        if(i!=strArr.length-1)
                        {
                            sb.append(strArr[i]);
                            sb.append(" ");
                        }
                        else sb.append(strArr[i]);
                    
        }
        String s = sb.toString();
        return s;

}
} */


/* public class Challenge {

    public static void main(String[] args){
        System.out.println(isPalindrome("madam") );
        System.out.println(isPalindrome("adieu"));
        System.out.println(isPalindrome("rotor") );
        
    }

	public static boolean isPalindrome(String str) {
        int n = str.length();   
    
        if (n == 0) 
            return true;   
        return checkPalindrome(str, 0, n - 1); 
	}

    static boolean checkPalindrome(String str, int s, int e) 
    { 
        if (s == e)    
            return true;  
        if ((str.charAt(s)) != (str.charAt(e))) 
            return false;   
                if (s < e + 1) 
            return checkPalindrome(str, s + 1, e - 1);   
        return true; 
    }  
} */


public class Challenge {

    public static void main(String[] args){
        System.out.println(isFactorial(2));
        System.out.println(isFactorial(27));
        System.out.println(isFactorial(24));
        
    }

	public static boolean isFactorial(int n) {
        int fac=2;
        int i=fac+1;
        boolean isFac=true;
        while (true) {
            if (fac==n) {
                return true;
            }
            else if (fac<n) {
                fac*=i;
                i++;
            }else
            {
                isFac=false;
                break;
            }
        }if (isFac) {
            return true;
        }return false;
	}
}