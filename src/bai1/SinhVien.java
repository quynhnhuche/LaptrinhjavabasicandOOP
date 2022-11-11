package bai1;

public class SinhVien {

    String ten;
    int tuoi;
    String msv;
    static String lop = "TH01";


    public String  getname(String ten){
        this.ten = ten;
        return ten;

    }
    public int getage(int tuoi){
        this.tuoi = tuoi;
        return tuoi;
    }
    public String getmsv (String msv){
        this.msv = msv;
        return msv;
    }

    public void quequan(){
        String city = "Bạc liêu";
        System.out.println("Quê quán:"+ city);
    }

    void display() {
        SinhVien sv = new SinhVien();
        System.out.println(sv.getmsv("SV001") + " - " + sv.getname("Tấn Phát") + " - " + sv.getage(30));
        sv.quequan();
    }

    public static void main(String[] args) {

        ThongTin tht= new ThongTin();
        SinhVien sv = new SinhVien();
        sv.display();
        tht.display();

    }
}
