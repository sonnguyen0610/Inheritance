package electricPrice;

public class PowerLow extends Business {
    private int normalHour = 2442;
    private int lowHour = 1361;
    private int highHour = 4251;

    @Override
    public double calcBill() {
        double totalPrice = normalHour * getNormalHour() + lowHour * getLowHour() + highHour * getHighHour();
        return totalPrice * 0.1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calculate bill of Business Low power:");
        sb.append(calcBill());
        return sb.toString();
    }
}
