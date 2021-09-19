package electricPrice;

public class Retail extends Individual {
    private int price1 = 1678;
    private int price2 = 1734;
    private int price3 = 2014;
    private int price4 = 2536;
    private int price5 = 2834;
    private int price6 = 2927;

    @Override
    public double calcBill() {
        super.calcBill();
        double totalPrice = 0;
        if (total_kWh() <= 50 && total_kWh() > 0) {
            totalPrice = total_kWh() * price1;
        } else if (total_kWh() >= 51 && total_kWh() <= 100) {
            totalPrice = 50 * price1 + (total_kWh() - 50) * price2;
        } else if (total_kWh() >= 101 && total_kWh() <= 200) {
            totalPrice = 50 * price1 + 50 * price2 + (total_kWh() - 100) * price3;
        } else if (total_kWh() >= 201 && total_kWh() <= 300) {
            totalPrice = 50 * price1 + 50 * price2 + 100 * price3 + (total_kWh() - 200) * price4;
        } else if (total_kWh() >= 301 && total_kWh() <= 400) {
            totalPrice = 50 * price1 + 50 * price2 + 100 * price3 + 100 * price4 + (total_kWh() - 300) * price5;
        } else if (total_kWh() >= 401) {
            totalPrice = 50 * price1 + 50 * price2 + 100 * price3 + 100 * price4 + 100 * price5 + (total_kWh() - 400) * price6;
        }
        double priceVAT=(double)(totalPrice * 0.1);
        return priceVAT;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calculate bill of Retail: ");
        sb.append(calcBill());
        return sb.toString();
    }
}
