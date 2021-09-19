package electricPrice;

public class PowerNormal extends Business{
    private int normalHour=2629;
    private int lowHour=1547;
    private int highHour=4400;

    @Override
    public double calcBill() {
        double totalPrice = normalHour * getNormalHour() + lowHour * getLowHour() + highHour * getHighHour();
        return totalPrice * 0.1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calculate bill of Business Normal power:");
        sb.append(calcBill());
        return sb.toString();
    }
}
