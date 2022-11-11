package bai5;
import java.util.ArrayList;

public class Edit_bt4 {
    public void Arraylist1(){
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                ArrayList<Integer> listint = new ArrayList<Integer>();
                listint.add(i);
                for (int j = 0; j < listint.size(); j++)
                    System.out.print(listint.get(j) + " ");


            }
            }

    }

    public static void main(String[] args) {
        Edit_bt4 ar = new Edit_bt4();
        ar.Arraylist1();
    }
}
