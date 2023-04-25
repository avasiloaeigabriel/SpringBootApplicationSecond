package AbstractClasses;

import java.util.ArrayList;
import java.util.List;

public class AbstractionRunner {
    public static void main(String[] args) {
        List<Animal> myAnimalList = new ArrayList<>();
        myAnimalList.add(new Cat());
        myAnimalList.add(new Dog());
        myAnimalList.add(new Bird());
        myAnimalList.forEach(animal -> animal.makeNoise());
        /////////////////////////////////////////////////////
        Animal cat2=new Cat();//se poate face si asa
        cat2.makeNoise();//se poate face si asa
    }


}
