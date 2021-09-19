package electricPrice;

public class PowerHigh extends Business{
    private int normalHour=2666;
    private int lowHour=1622;
    private int highHour=4587;


    @Override
    public double calcBill() {
        double totalPrice = normalHour * getNormalHour() + lowHour * getLowHour() + highHour * getHighHour();
        return totalPrice * 0.1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calculate bill of Business High power:");
        sb.append(calcBill());
        return sb.toString();
    }
}
