package bai2;

public class Calculator {

    public int Sum(int a, int b) {
        return a + b;
        // Hàm có return thì có được sử dụng câu lệnh Println hay ko?
    }

    public double tich(double x, double y) {
        return x*y; // Tại sao sử đụng kiểu double khi return x*y lại báo lỗi
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.Sum(3, 9));
        System.out.println(cal.tich(10.5f, 5.6f));

    }
}
