package Replit;

public class repl_151_Method {
    static int[][]   a = {  { 1, 2, 3 },
                     { 4, 5, 6 },
                     { 7, 8, 9 }  };
    static int sum;
    static void arraysum(){
        sum=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
    }
}
