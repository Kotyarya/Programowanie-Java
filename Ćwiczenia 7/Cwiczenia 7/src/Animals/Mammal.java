package Animals;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class Mammal extends Animal{

    private  String mammalType;
    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }

    @Override
    public void getVoices() {
        System.out.println("Mammal voice");
    }
}
