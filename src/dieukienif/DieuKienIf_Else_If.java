package dieukienif;

public class DieuKienIf_Else_If {

    public static void main(String[] args) {
        int DTB = 8;
        if  (DTB > 8){
            System.out.println("Xếp loại Xuất sắc");
        }
        else if (DTB == 8){
            System.out.println("Xếp loại giỏi");
        } else if (DTB <8 && DTB >= 7) {
            System.out.println("Khá");
        } else if (DTB < 7 && DTB >= 6) {
            System.out.println("TB");
        }
        else
        System.out.println(" Yếu");
    }
}
