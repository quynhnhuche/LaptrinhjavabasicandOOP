package JavaOop_bai2.Company;

import JavaOop_bai2.Person.Person;

public class Company {
    public void getInfor() {
        Person per = new Person("Mai", 40, "Nữ");
        System.out.println("Tên:" +per.getName());
        System.out.println("Tuổi:" +per.getAge());
        System.out.println("Giới Tính:"+per.getGender());
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.getInfor();
    }

}
