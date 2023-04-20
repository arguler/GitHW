package Homework_03_Group;

/*Write a program to print out duplicate elements from
an Array of Strings?*/
public class GroupHW_10 {
    public static void main(String[] args) {
        String[] dizi = {"murat", "metin", "kiraz", "çilek", "cengiz", "hasan", "muhlis", "ahmet",
                "sami", "murat", "mutlu", "tahir", "deli", "bidon", "murat", "bize"};
        String gecici = dizi[0];
        String asil=null;
        int counter=0;
        for (int i = 0; i <dizi.length; i++) {
            if (gecici.equals(dizi[i])) {
                asil = gecici;
                counter++;
            }
        }
        System.out.println(asil+"("+counter+")");
    }
}



