import java.awt.*;


public class Main {
    public static void main(String[] args) {


        Car car = new Car("X5", "BMW", 2020, 15999, Color.BLACK, 84);
        Car car2 = new Car("A8", "BMW", 2020, 15999, Color.RED, 84);





        System.out.print(car.toString());

        car.sell();

        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car.getQuantity());
        System.out.println(car.getPrice());

        car.setPrice(24000);

        System.out.print(car.toString());



        System.out.println(car.equals(car2));
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());


        /*

        RectangleArea rect = new RectangleArea();

        rect.getData();
        rect.computeField();
        rect.fieldDisplay();

         */
    }
}


