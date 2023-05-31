package Samples;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.TreeSet;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Amasya");
        cities.add("Kayseri");
        cities.add("Balikesir");
        cities.add("Hakkari");
        cities.add("Adana");
        System.out.println(cities);
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).startsWith("A")){
                cities.remove(i);
            }
        }
        System.out.println(cities);
        TreeSet<String> cities1=new TreeSet<>(cities);
        System.out.println(cities1);
        XSSFWorkbook xssfWorkbook;

    }
}
