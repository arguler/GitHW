package Samples;

import java.util.Scanner;

class ornek2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String secilecekharfler="aeiou";
        for(int i = 0 ; i<=word.length()-1;i++)
        {
            for(int j= 0 ; j<=4;j++)
            {
                if(word.charAt(i)==secilecekharfler.charAt(j))
                {
                    System.out.print(word.charAt(i));
                }

            }

        }
    }
}