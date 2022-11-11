package JavaOop1;

public class ThongTin {
    public static void main(String[] args) {

        NhanVien nv1 = new NhanVien("Sơn",25,"Bình Thạnh, HCM", "Dev android");
        NhanVien nv2 = new NhanVien("Thanh", 28, "Gò vấp. HCM", "PM");
        nv1.display();
        nv2.display();
    }

}
