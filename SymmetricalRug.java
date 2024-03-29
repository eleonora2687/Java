/* public class SymmetricalRug {


    public static void main(String[] args) {
        String[] s ={"TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", 
                     "TTEEEEEEEEEEEEEEEEEEEEEEEEEEEETT", "TTEEEEEEEEEEEEEEEEEEEEEEEEEEEETT", 
                     "TTEESSSSSSSSSSSSSSSSSSSSSSSSEETT", "TTEESSSSSSSSSSSSSSSSSSSSSSSSEETT", 
                     "TTEESSHHHHHHHHHHHHHHHHHHHHSSEETT", "TTEESSHHHHHHHHHHHHHHHHHHHHSSEETT", 
                     "TTEESSHHAAAAAAAAAAAAAAAAHHSSEETT", "TTEESSHHAAAAAAAAAAAAAAAAHHSSEETT", 
                     "TTEESSHHAADDDDDXDDDDDDAAHHSSEETT", 
                     "TTEESSHHAAAAAAAAAAAAAAAAHHSSEETT", "TTEESSHHAAAAAAAAAAAAAAAAHHSSEETT", 
                     "TTEESSHHHHHHHHHHHHHHHHHHHHSSEETT", "TTEESSHHHHHHHHHHHHHHHHHHHHSSEETT", 
                     "TTEESSSSSSSSSSSSSSSSSSSSSSSSEETT", "TTEESSSSSSSSSSSSSSSSSSSSSSSSEETT", 
                     "TTEEEEEEEEEEEEEEEEEEEEEEEEEEEETT", "TTEEEEEEEEEEEEEEEEEEEEEEEEEEEETT", 
                     "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"};
        

        System.out.println(countLayers(s));
        
    }
    public static int countLayers(String[] rug) {
        String[] temp=new String[rug.length];
        
        temp[0]=rug[0];
        int counter=0;
        for (int i = 1; i < rug.length; i++) {
            int j = 0, k= rug[i].length() - 1;
            boolean pali=true;
        
           while (j < k) {
            
            if (rug[i].charAt(j) != rug[i].charAt(k))
                {
                    pali=false;
                    break;
                }
                j++;
                k--;
            }
            if (pali) {
                int m;
                for(m=0;m<i;m++)
                {
                if(temp[m]==rug[i])
                {
                    break;
                }
            }
            if(m==i)
            {
                temp[m]=rug[i];
            }
                    
                }
            
        }
        
        
          for (int d = 0; d < temp.length; d++) {
            {
                System.out.println(temp[d]);
            if(temp[d]!=null) counter++;}
            
          }
          
          return counter;
    }


  } 
    

 */




 public class SymmetricalRug {


    public static void main(String[] args) {
        String[] s ={"TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", 
                     "TTEEEEEEEEEEEEEEEEEEEEEEEEEEEETT", "TTEEEEEEEEEEEEEEEEEEEEEEEEEEEETT", 
                     "TTEESSSSSSSSSSSSSSSSSSSSSSSSEETT", "TTEESSSSSSSSSSSSSSSSSSSSSSSSEETT", 
                     "TTEESSHHHHHHHHHHHHHHHHHHHHSSEETT", "TTEESSHHHHHHHHHHHHHHHHHHHHSSEETT", 
                     "TTEESSHHAAAAAAAAAAAAAAAAHHSSEETT", "TTEESSHHAAAAAAAAAAAAAAAAHHSSEETT", 
                     "TTEESSHHAADDDDDXDDDDDDAAHHSSEETT", 
                     "TTEESSHHAAAAAAAAAAAAAAAAHHSSEETT", "TTEESSHHAAAAAAAAAAAAAAAAHHSSEETT", 
                     "TTEESSHHHHHHHHHHHHHHHHHHHHSSEETT", "TTEESSHHHHHHHHHHHHHHHHHHHHSSEETT", 
                     "TTEESSSSSSSSSSSSSSSSSSSSSSSSEETT", "TTEESSSSSSSSSSSSSSSSSSSSSSSSEETT", 
                     "TTEEEEEEEEEEEEEEEEEEEEEEEEEEEETT", "TTEEEEEEEEEEEEEEEEEEEEEEEEEEEETT", 
                     "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"};
        

        System.out.println(countLayers(s));
        String[] s1 ={"AAAAAAAAA", 
                        "ABBBBBBBA", 
                        "ABBBBBBBA", 
                        "ABBBBBBBA", 
                        "AAAAAAAAA"};
        

        System.out.println(countLayers(s1));

        String[] s2 ={"AAAAAAAAA", 
                      "ABBBBBBBA", 
                      "ABBAAABBA", 
                      "ABBBBBBBA", 
                      "AAAAAAAAA"};
        

        System.out.println(countLayers(s2));

        String[] s3 ={"AAAAAAAAA", "ABBBBBBBA", "ABCCCCCBA", "ABBBBBBBA", "AAAAAAAAA"};
        

        System.out.println(countLayers(s3));

        String[] s4 ={"AAAAAAAAAAA", "AABBBBBBBAA", "AABCCCCCBAA", "AABCAAACBAA", "AABCADACBAA", "AABCAAACBAA", "AABCCCCCBAA", "AABBBBBBBAA", "AAAAAAAAAAA"};
        

        System.out.println(countLayers(s4));

        String[] s5 ={"AAAAAAAAAAA", "AABBBBBBBAA", "AABCCCCCBAA", "AABCAAACBAA", "AABCABACBAA", "AABCAAACBAA", "AABCCCCCBAA", "AABBBBBBBAA", "AAAAAAAAAAA"};
        

        System.out.println(countLayers(s5));

        String[] s6 ={"AAAAAAAAAAA", "AABBBBBBBAA", "AABCCCCCBAA", "AABCDDDCBAA", "AABCDDDCBAA", "AABCDDDCBAA", "AABCCCCCBAA", "AABBBBBBBAA", "AAAAAAAAAAA"};
        

        System.out.println(countLayers(s6));

        String[] s7 ={"FFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFGGGGGGGGGGGGGGGGGFFFF", "FFFFGGGAAAAAAAAAAAGGGFFFF", "FFFFGGGAABBBBBBBAAGGGFFFF", "FFFFGGGAABCCCCCBAAGGGFFFF", "FFFFGGGAABCDDDCBAAGGGFFFF", "FFFFGGGAABCDDDCBAAGGGFFFF", "FFFFGGGAABCDDDCBAAGGGFFFF", "FFFFGGGAABCCCCCBAAGGGFFFF", "FFFFGGGAABBBBBBBAAGGGFFFF", "FFFFGGGAAAAAAAAAAAGGGFFFF", "FFFFGGGGGGGGGGGGGGGGGFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFF"};
        

        System.out.println(countLayers(s7));

        String[] s8 ={"TTTTTTTTTTTTTT", "TEEEEEEEEEEEET", "TESSSSSSSSSSET", "TESHHHHHHHHSET", "TESHAAAAAAHSET", "TESHHHHHHHHSET", "TESSSSSSSSSSET", "TEEEEEEEEEEEET", "TTTTTTTTTTTTTT"};
        

        System.out.println(countLayers(s8));
        
    }
    public static int countLayers(String[] rug) {
        String [] temp= new String[(int)Math.ceil(rug.length)];
        String [] result=new String[temp.length];
        int counter=0;
        int j = 0, k= rug.length-1;


        while (j<=k) {
            if(rug[j]==rug[k])
                temp[j]=rug[j];
            j++;
            k--;
        }

        result[0]=temp[0];
        int l;
        for (int i = 1; i < temp.length; i++) {
            for (l = 0; l < i; l++) {
                if (temp[i]==temp[l]) {
                    break;
                }
            }if (i==l) {
                result[i]=temp[l];
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i]!=null) {
                counter++;
            }
        }return counter;

    }


  } 
    

