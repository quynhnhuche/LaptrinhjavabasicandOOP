package for_each;

public class Mang {
    public static void main(String[] args) {
        int mang[] = new int[10];

        mang[0] =4;
        mang[1] = 6;
        mang[2] = 19;

       // System.out.println(mang[2]); // truy xuất ra 1 phần tử cụ thể ở vị trí nào
        //for (int i : mang ){
            //System.out.println(i);

        //}
        for(int i =0; i < mang.length; i++){
            System.out.println(mang[i]);
        }
    }
}
