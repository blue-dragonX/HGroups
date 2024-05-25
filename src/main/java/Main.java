import HGroups.*;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) {
     Triad<String, Integer, Car> person1 = new Triad<>("Phillip", 45, new Car("Volkswagen"));
        Pair<Integer, Car> person1Car= person1.get("Phillip");
        System.out.println(person1.<Car>retrieve(3).getName());
        String q = person1.retrieve(1);
        person1Car.printGroup();
        Pentad<String, Integer, Car, Integer, Double> person12= new Pentad<>(person1,new Pair<>(33,3.14) );
        System.out.println();
        person12.printGroup();
        System.out.println();
Tetrad<String, Integer, Car,Double> test = new Tetrad<>("Phil", 35, new Car("BMW"),3.14);
test.getInfo(test.retrieve(3));
    }
}