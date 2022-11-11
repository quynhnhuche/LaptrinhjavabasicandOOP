package bai3;

public class ToanTu {

    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        boolean z;
        z = x == y;
        System.out.println("kết quả z = x == y? : " +z);
        z = 3 +2 != x;
        System.out.println("Kết quả z = 3+2 != x? : " + z);

        if((x*y >= 10)&& (y/x <5)){
            System.out.println("Kết quả biểu thức 1: True");
        }
        else {
            System.out.println("Kết quả biểu thức 1: False");
        }
        if (((x+y != 20) || (y-x == 2))) {
            System.out.println("Kết quả biểu thức 2: True");

        }
        else {
            System.out.println("Kết quả biểu thức 2:False");
        }




    }
}
