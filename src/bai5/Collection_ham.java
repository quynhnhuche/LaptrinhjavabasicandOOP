package bai5;

import java.util.ArrayList;

public class Collection_ham {
    String name;
    int tuoi;
    String pban;
    String quequan;

    public Collection_ham(String name, int tuoi, String pban, String quequan) {
        this.name = name;
        this.tuoi = tuoi;
        this.pban = pban;
        this.quequan = quequan;
    }

    public static ArrayList Shownv() {
        // khởi tão array list
        ArrayList<Collection_ham> nhanvien = new ArrayList<Collection_ham>();

        Collection_ham ttnv1 = new Collection_ham("Phuong", 28, "Marketing", "tiền giang");
        Collection_ham ttnv2 = new Collection_ham("Vy", 25, "Product", "Bến tre");
        Collection_ham ttnv3 = new Collection_ham("Thuong", 32, "Product", "Đà lạt");
        Collection_ham ttnv4 = new Collection_ham("Gin", 30, "Operation", "Hà Nội");

        //Nạp nhân viên vào arraylist
        nhanvien.add(ttnv1);
        nhanvien.add(ttnv2);
        nhanvien.add(ttnv3);
        nhanvien.add(ttnv4);
        return nhanvien;


    }

    public String toString() {
        return "Name nv:" + name + "- Tuổi:" + tuoi + "- Phòng ban: " + pban + "- Quê Quán: " + quequan + "\n";
    }
    //? Hàm toString không cần gọi lại vẫn hiển thị đúng định dạng như trong àm toString trả về?

    public static void main(String[] args) {
        // gọi lại arraylist và dùng for duyệt để in ra danh sách
        for (int j = 0; j < Shownv().size(); j++)
            System.out.print(Shownv().get(j));
    }
}
