package Animals;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal implements AnimalBehaivor, AnimalMove, AnimalName {
    private String name;
    private int age;
    private int weight;


    public abstract void eat();

    public abstract void getVoices();

    @Override
    public void sleep() {
        System.out.println("I am sleep");
    }


}
