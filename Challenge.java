/* public class Challenge {
    public static void main(String[] args)
    {
        System.out.println(squares(3, 9));
        System.out.println(squares(17, 24));
        System.out.println(squares(1, 1000000000));
    }

    public static int squares(int a, int b) {
          boolean isSquareInteger;
          int numOfSquares=0;
          double square, floor_square;
           

          for (int i = a; i <= b; i++) {
            int x=i % 10;
            isSquareInteger=false;
            if (i==1 || i==4) {
                numOfSquares+=1;
                continue;
            }
            if (x==2 || x==3 || x==7 || x==8)   
            {  
                continue;
            }  
            else {
                square=Math.sqrt(i);
                floor_square=Math.floor(square);

                if (square==floor_square) {
                    isSquareInteger=true;
                }
            }

            if (isSquareInteger) {
                numOfSquares+=1;
            }
          }return numOfSquares;
    }
  } */

  /* public class Challenge {
    public static void main(String[] args)
    {
        System.out.println(validate("121317"));
        System.out.println(validate("1234"));
        System.out.println(validate("45135"));
        System.out.println(validate("89abc1") );
        System.out.println(validate("900876"));
        System.out.println(validate(" 4983"));
    }


    public static boolean validate(String pin) {
        return (pin.matches("^[0-9]{4}") || pin.matches("^[0-9]{6}"));

    }
  }

 */

 /* public class Challenge {
    public static void main(String[] args)
    {
        int [][] points={{15,7}, {5,22}, {11,1}};
        System.out.println(perimeter(points));
        int [][] points1={{0, 0},{0, 1},{1, 0}};
        System.out.println(perimeter(points1));
        int [][] points2={{-10, -10},{10, 10},{-10, 10}};
        System.out.println(perimeter(points2));
    }


    public static double perimeter(int[][] point) {
        return Math.sqrt((point[0][0]-point[1][0])*(point[0][0]-point[1][0])+(point[0][1]-point[1][1])*(point[0][1]-point[1][1]))+ 
        Math.sqrt((point[0][0]-point[2][0])*(point[0][0]-point[2][0])+(point[0][1]-point[2][1])*(point[0][1]-point[2][1])) + 
        Math.sqrt((point[1][0]-point[2][0])*(point[1][0]-point[2][0])+(point[1][1]-point[2][1])*(point[1][1]-point[2][1]));
    }
}

 */

