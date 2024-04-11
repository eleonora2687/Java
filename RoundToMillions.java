/* import java.util.Arrays;

public class RoundToMillions {

    public static void main(String[] args) {
        System.out.println(winRound(new int[] {6, 5, 5, 8, 5}, new int[] {6, 2, 5, 2, 5}));
        System.out.println(winRound(new int[] {9, 8, 7, 3, 4}, new int[] {5, 3, 4, 7, 9}));
        System.out.println(winRound(new int[] {4, 3, 4, 4, 5}, new int[] {3, 2, 5, 4, 1}));
    }

    public static boolean winRound(int[] you, int[] opp) {
		quickSort(you, 0, you.length-1);
        quickSort(opp, 0, opp.length-1);
        int you1, you2;
        you1=you[you.length-2]*10+you[you.length-1];
        you2=opp[opp.length-2]*10+opp[opp.length-1];
        return (you1>you2?true:false);
	}

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
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
}

*/

/* import java.util.Arrays;

public class RoundToMillions {

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
		arr[0][0] = 0;
		arr[0][1] = 0;
		arr[1][0] = 1;
		arr[1][1] = 0;
		arr[2][0] = 0;
		arr[2][1] = 1;
        System.out.println(perimeter(arr));
        
    }

    public static double perimeter(int[][] point) {
		return Math.round((Math.sqrt(Math.pow(point[0][0]-point[1][0], 2)+Math.pow(point[0][1]-point[1][1], 2))+Math.sqrt(Math.pow(point[0][0]-point[2][0], 2)+Math.pow(point[0][1]-point[2][1], 2))+Math.sqrt(Math.pow(point[1][0]-point[2][0], 2)+Math.pow(point[1][1]-point[2][1], 2))) * 100.0) / 100.0;
    }
    
    
}


 */


 /* import java.util.Arrays;

 public class RoundToMillions {
 
     public static void main(String[] args) {
         System.out.println(isCurzon(65));  
         System.out.println(isCurzon(10));
         System.out.println(isCurzon(14) );   
     }
 
     public static boolean isCurzon(int n) {
       
		return (Math.pow(2, n)) % (2*n+1) == 2*n;
     }
     
     
 }
 
 
  */

  import java.util.Arrays;

import javax.lang.model.type.NullType;

  public class RoundToMillions {
  
      public static void main(String[] args) {
          System.out.println(unrepeated("teshahset"));
          System.out.println(unrepeated("hello"));
          System.out.println(unrepeated("aaaaa"));
          System.out.println(unrepeated("WWE!!!")); 
          System.out.println(unrepeated("call 911"));  
          
      }
  
      public static String unrepeated(String str) {
        
        char[] charArray;
        charArray = new char[str.length()];
        charArray[0]=str.charAt(0);
        
        for (int i = 1; i < str.length(); i++) {

            int j=0;
            boolean exists=false;
            while ((int)charArray[j]!=0) {
                if(charArray[j]==str.charAt(i))
                {
                    exists=true;
                    break;
                }j++;
            }
            if (!exists) {
                charArray[j]=str.charAt(i);
            }
        }
        int count=0;
        int k=0;

        while ((int)charArray[k]!=0) {
                count++;
                k++;
        }

        String s="";

        for (int l = 0; l < count; l++) {
            s+=(charArray[l]);
        }

        return s;
      }
      
      
  }
  
  
  