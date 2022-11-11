package JavaOop1;

public class NhanVien {
    String name;
    int tuoi;
    String diachi;
    String chucvu;

    public NhanVien(String name, int tuoi, String diachi,String chucvu){
        this.name = name;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.chucvu = chucvu;
    }
    public void display(){

        System.out.println("Tên nhân viên:" + name);
        System.out.println("Tuôỉ:" + tuoi);
        System.out.println("Địa chỉ:"+ diachi);
        System.out.println("Chức vụ:"+ chucvu +"\n");
    }


}
