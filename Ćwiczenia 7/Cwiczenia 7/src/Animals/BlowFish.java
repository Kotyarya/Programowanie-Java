package Animals;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class BlowFish extends Fish {

    private String color;

    @Override
    public void eat() {
        System.out.println("BlowFish is eating");
    }

    @Override
    public void getVoices() {
        System.out.println("---------");
    }
}
