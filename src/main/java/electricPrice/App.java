package electricPrice;

public class App {
    public static void main(String[] args) {

        Individual retail=new Retail();
        retail.inputCus();
        System.out.println(retail);

        Individual whosale =new Wholesale();
        whosale.inputCus();
        System.out.println(whosale);

        Business low=new PowerLow();
        low.inputCus();
        System.out.println(low);

        Business normal=new PowerNormal();
        normal.inputCus();
        System.out.println(normal);

        Business high=new PowerHigh();
        high.inputCus();
        System.out.println(high);
    }
}
