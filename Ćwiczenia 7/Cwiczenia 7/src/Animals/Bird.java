package Animals;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class Bird extends Animal{


    private String birdType;

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void getVoices() {
        System.out.println("Bird voice");
    }
}
