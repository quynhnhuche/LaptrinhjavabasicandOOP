package bai3;

import java.util.Scanner;

public class DieuKienIfElse {

    public int thamso (int n){
        if ( n < 0) {
            System.out.println("N bé hơn 0");
        } else if (n > 0) {
            System.out.println("N lớn hơn 0");

        } else if (n == 0 ) {
            System.out.println("N bằng 0");

        }
        return n;

    }

    public static void main(String[] args) {
        DieuKienIfElse dk = new DieuKienIfElse();
        dk.thamso(0);
    }
}
