import java.util.Scanner;

public class RectangleArea {

    float sideA;
    float sideB;
    float area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write side A");

        this.sideA = scanner.nextFloat();

        System.out.println("Please write side B");

        this.sideB = scanner.nextFloat();

    }


    public void computeField() {
        this.area = sideA * sideB;
    }


    public void fieldDisplay() {
        System.out.println("Side A : " + this.sideA);
        System.out.println("Side B : " + this.sideB);
        System.out.println("Area : " + this.area);

    }
}
