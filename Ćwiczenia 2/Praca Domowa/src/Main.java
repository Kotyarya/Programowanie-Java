import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal costProductNetto = new BigDecimal("9.99");
        BigDecimal VAT = costProductNetto.multiply(new BigDecimal("1.23"));
        BigDecimal costProductBrutto = costProductNetto.add(VAT);
        BigDecimal costThusandProductsBrutto = costProductBrutto.multiply(new BigDecimal(10000));
        BigDecimal costThusandProductsNetto = (costProductBrutto.subtract(VAT)).multiply(new BigDecimal(10000));

        System.out.println(costThusandProductsBrutto.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println(costThusandProductsNetto.setScale(2, RoundingMode.HALF_DOWN));

    }
}