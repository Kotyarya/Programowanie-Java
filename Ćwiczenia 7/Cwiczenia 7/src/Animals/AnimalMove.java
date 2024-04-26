package Animals;

public interface AnimalMove {

    default void move() {
        System.out.println("I am move");
    }
}
