package Homework_01;

public class HWArray7 {
    public static void main(String[] args) {
        int [] findbig={23,67,789,12,54,92,34,42,90,456};
        int bignumber=findbig[0], x=0;
        for (int i = 0; i < 10; i++) {
            if (bignumber>=findbig[i]){
                x=bignumber;}
            else {
                bignumber=findbig[i];}
        }
        System.out.println(x);
    }
}
