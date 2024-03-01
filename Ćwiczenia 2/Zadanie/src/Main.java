import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        //TIP  Zadanie 2.

        System.out.println("Zadanie 2. -----");


        float myWeightAksamitnyi = 58f;

        double myWieghtOnMarsAksamitnyi = myWeightAksamitnyi + (myWeightAksamitnyi * 0.38);

        System.out.printf("%,.4f%n", myWieghtOnMarsAksamitnyi);

        int myWieghtOnMarsAksamitnyiInt = (int) myWieghtOnMarsAksamitnyi;

        System.out.println(myWieghtOnMarsAksamitnyiInt);

        char myWieghtOnMarsAksamitnyiChar = (char) myWieghtOnMarsAksamitnyiInt;

        System.out.println(myWieghtOnMarsAksamitnyiChar);

        int myWieghtOnMarsAksamitnyiNewInt = 567 + myWieghtOnMarsAksamitnyiChar;

        System.out.println(myWieghtOnMarsAksamitnyiNewInt);


        System.out.println("----------------");

        //TIP  Zadanie 3.

        System.out.println("Zadanie 3. -----");


        int randomNumAksamitnyi = (int) Math.floor(Math.random() * 100);

        System.out.println("Losowa liczba : " + randomNumAksamitnyi);

        System.out.println(randomNumAksamitnyi % 2 == 0 ? "Ta liczba jest parzysta" : "Ta liczba jest nie parzysta");


        System.out.println("----------------");

        //TIP  Zadanie 4.

        System.out.println("Zadanie 4. -----");


        int amuntOfBricks = 80;
        int containerCapacity = 8;
        int countContainer = (int) Math.floor(amuntOfBricks / containerCapacity);
        int rest = amuntOfBricks % countContainer;

        System.out.println("Mamy " + countContainer + " pełnych pojemników");
        System.out.println(rest + " Klocków w nie pełnym pojemniku");
        System.out.println(rest > 0 ? "Mamy nie pełny pojemnik" : "Nie mamy nie pełnego pojemniku");


        System.out.println("----------------");

        //TIP  Zadanie 5.

        System.out.println("Zadanie 5. -----");


        BigDecimal costProductNetto = new BigDecimal("9.99");
        BigDecimal VAT = costProductNetto.multiply(new BigDecimal("1.23"));
        BigDecimal costProductBrutto = costProductNetto.add(VAT);
        BigDecimal costThusandProductsBrutto = costProductBrutto.multiply(new BigDecimal(10000));
        BigDecimal costThusandProductsNetto = (costProductBrutto.subtract(VAT)).multiply(new BigDecimal(10000));

        System.out.println(costThusandProductsBrutto.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println(costThusandProductsNetto.setScale(2, RoundingMode.HALF_DOWN));


        System.out.println("----------------");
    }
}
