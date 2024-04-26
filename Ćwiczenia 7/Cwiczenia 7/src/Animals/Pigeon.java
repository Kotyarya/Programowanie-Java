package Animals;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString

public class Pigeon extends Bird{

    private String color;

    @Override
    public void eat() {
        System.out.println("Pigeon is eating");
    }

    @Override
    public void getVoices() {
        System.out.println("Pigeon voice");
    }

    @Override
    public void move() {
        System.out.println("Pigeon swim");
    }
}
