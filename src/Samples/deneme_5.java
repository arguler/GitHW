package Samples;

public class deneme_5 {
    static String[] ulkeler = {"Türkiye", "Almanya", "Çekya", "Güney Kore", "Japonya", "Zimbabve"};

    static int enUzunIndex=0;
    static int maxKelimeSayisi=0;

    public static void main(String[] args) {
        for (int i=0; i<ulkeler.length ; i++)
        {
            if (ulkeler[i].length() > maxKelimeSayisi)
            {
                enUzunIndex = i;
                maxKelimeSayisi = ulkeler[i].length();
            }
        }
        System.out.println("En uzun isimli ülke:"+ulkeler[enUzunIndex]);
    }

}
