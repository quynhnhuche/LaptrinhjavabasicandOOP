package JavaOop_bai2.Person;

import java.util.ArrayList;

public class Information {
    public void display (){
        Person p = new Person("Nhu", 32,"nữ","quận 5, TPHCM", "0943788334");

            System.out.println("Tên Nhân Viên: " + p.getName());
            System.out.println("Tuổi:"+ p.getAge());
            System.out.println("Giới Tính:"+p.getGender());
            System.out.println("SDT:"+p.getPhone());
            System.out.println("Địa chỉ:"+p.getAddress());
            }



    public static void main(String[] args) {
        Information infor = new Information();
        infor.display();

        }



}
