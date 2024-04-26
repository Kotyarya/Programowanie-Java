package Animals;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Fish extends Animal {

    private String fishType;

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void getVoices() {
        System.out.println("Bro i am a fish");
    }
}
