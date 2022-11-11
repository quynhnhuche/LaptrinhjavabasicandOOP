package bai4;

public class VongLap_Mang {

    public void  vonglap() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                //System.out.println(i);
                int array[] = {i};
                for (int j = 0; j < array.length; j++)
                    System.out.print(array[j] + " ");
            }
        }

    }

    public static void main(String[] args) {
        VongLap_Mang vl = new VongLap_Mang();
        vl.vonglap();
    }
}
