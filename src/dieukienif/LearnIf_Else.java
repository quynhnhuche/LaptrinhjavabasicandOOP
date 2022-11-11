package dieukienif;

public class LearnIf_Else {
    public static void main(String[] args) {
        int age = 30;
        String name = "Selenium";
//        if (age > 30) {
//            System.out.println("Tuổi lớn hơn 30");
//        } else {
//            System.out.println("Tuổi nhỏ hơn 30");
//        }
        //kết hợp nhiều điều kiện

        if (age > 30 && name.equals("Selenium")) {
            System.out.println("Passed. Tuổi lớn hơn 30");
        }
        //equals dùng để so sánh bằng cho kiểu string
            else{
                System.out.println("Failed. Tuổi nhỏ hơn 30");
            }


    }
}
