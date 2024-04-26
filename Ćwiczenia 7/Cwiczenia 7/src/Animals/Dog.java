package Animals;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString

public class Dog extends Mammal {

    private String dogType;

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void getVoices() {
        System.out.println("Dog voice");
    }
}
