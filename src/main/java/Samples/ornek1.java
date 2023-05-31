package Samples;

import java.util.Scanner;
import java.util.ArrayList;

class ornek1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //System.out.print("In:");
        //write your code below
        ArrayList<String> isimler = new ArrayList<String>();
        //System.out.println("Alışveriş Listesini Oluşturunuz : ");
        for (int i = 0; i < 5; i++) {
            isimler.add(inp.next());
        }
        //System.out.println("Market Listesi : ");
        for (int j = 0; j < 5; j++) {
            System.out.println(isimler.get(j).substring(0,3));
        }
    }

}
