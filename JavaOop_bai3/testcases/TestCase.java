package JavaOop_bai3.testcases;

import JavaOop_bai3.common.BaseTest;

import java.sql.SQLOutput;

public class TestCase extends BaseTest {
    public void login (String username, String password){
    String name = "William C. Schroyer";
        createDriver();
        System.out.println("Go to link: https://demo.activeitzone.com/ecommerce/login");
        System.out.println("Input username:" + username);
        System.out.println("Input Password:" + password);
        System.out.println("Click the button Login");
        if (name  == "William C. Schroyer") // xét 1 giá trị ở trang login thành công, để làm điều kiện đánh giá testcase login pass hay failed
        {
            System.out.println( "Login successful!");
        }
        else
        {
            System.out.println("Login failed!");
        }
        closeDriver();
    }

    public  void addCategory(String categoryname){
        createDriver();
        System.out.println("Go to link: https://demo.activeitzone.com/ecommerce/login");
        System.out.println("After Login successful, Click on products in the menu on the left");
        System.out.println("Click Category and show category list page");
        System.out.println("Click button Add New category");
        System.out.println("Input category name:" + categoryname);
        System.out.println(" Click button Save");

        // duyệt list category nếu tìm thấy category name vừa tạo  để đánh giá add category thành công
        String listcate = categoryname;
        if (listcate == categoryname)
        {
            System.out.println("Create category successful");        }
        else
        {
            System.out.println("Create category failed");
        }
        closeDriver();

    }

    public static void main(String[] args) {
        TestCase tc = new TestCase();
        System.out.println("TC001: Login " +"\n");
        tc.login("admin@example.com","123456");
        System.out.println("\n"+"TC002: Add category" +"\n");
        tc.addCategory(" newborn");
    }


}
