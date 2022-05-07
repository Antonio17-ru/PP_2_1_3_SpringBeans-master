package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal;
    private Animal animal1;
    @Autowired
    public AnimalsCage(@Qualifier ("dog") Animal animal, @Qualifier ("cat") Animal animal1) {
        this.animal = animal;
        this.animal1 = animal1;
    }


    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
