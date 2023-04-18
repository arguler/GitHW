package class10;
/* Create a 2D array (shorter way) in which first array will consist of 4 names
and second array will contain grades. Then your program should print name of the
students that has A and B grade */
public class HW2DArray_01 {
    public static void main(String[] args) {
        String[][] namesgrades = {{"Sami", "Melike", "Mühlike", "Ali Rıza"},
                {"8", "5", "doctorate", "degree"}
        };
        for (int i = 0; i < 4; i++) {
            System.out.print(namesgrades[0][i]+" ");
            System.out.println(namesgrades[1][i]);
        }
        String [][] array=new String[2][4];
        array[0][0]="Mehmet";
        array[0][1]="Hasan";
        array[0][2]="Ayşe";
        array[0][3]="Kenan";
        array[1][0]="A";
        array[1][1]="B";
        array[1][2]="E";
        array[1][3]="G";
        System.out.println(array[0][0]+" "+array[1][0]);
        System.out.println(array[0][1]+" "+array[1][1]);
    }
}
