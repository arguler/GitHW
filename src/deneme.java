public class deneme {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int [][] b=new int [4][1];
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum=sum+a[i][j];
            }b[i][0]=sum;
            sum=0;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i][0]);
        }


    }
}

