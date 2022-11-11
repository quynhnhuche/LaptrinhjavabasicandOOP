package JavaOop_bai3.common;

public class BaseTest {



public  void createDriver(){
Constants.setBrowser("Chrome");
Constants.setHeadless(true);
Constants.setReport(true);


    System.out.println("Open browser:"+ Constants.getBrowser());
    System.out.println("Set Chrome as headless:" + Constants.isHeadless());
    System.out.println(Constants.isReport());


}
public void closeDriver(){
    System.out.println("Close browser:"+ Constants.getBrowser());

}

    public static void main(String[] args) {
    BaseTest ba = new BaseTest();
        ba.createDriver();
        ba.closeDriver();
    }
}
