import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode(of = {"brand"})
public class Car {

    private String model;
    private String brand;
    private int year;
    private float price;
    private Color color;
    private int quantity;


    public void delivery() {
        ++this.quantity;
    }

    public void sell() {
        --this.quantity;
    }

}
