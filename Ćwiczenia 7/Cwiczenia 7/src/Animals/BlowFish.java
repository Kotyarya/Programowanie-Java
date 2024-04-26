package Animals;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class BlowFish extends Fish {

    private String color;

    @Override
    public void eat() {
        System.out.println("BlowFish is eating");
    }

}
