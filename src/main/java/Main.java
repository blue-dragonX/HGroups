import HGroups.*;


public class Main {
    public static void main(String[] args) {
        Triad<Integer, String, Double> testTriad = new Triad<>(1,"Hello", 7.5);
        Triad<Car, String, Double> testTriad2 = new Triad<>(new Car("Humvee"),"Hlo", 7.599);
        Pentad<Integer, Double, String, Car, String> testPentad = new Pentad<>(1,3.14, "Hello World!", new Car("Beetle"),"Goodbye!");
        Pair pair1 = testTriad.get(1);
        pair1.printGroup();
        testPentad.printGroup();
        System.out.println("\n");
        int x = testTriad.retrieve(1);
        Car testCar= testPentad.retrieve(4);
        System.out.println(testCar.getName());
        System.out.println(x);
        double doubelFromTriad= testTriad.retrieve(3);
        System.out.println(doubelFromTriad*2);
        testTriad.printGroup();
        System.out.println();
        Hexad<Integer, String, Double,Integer,Integer,String> hexad1 = new Hexad<>(testTriad,new Triad<>(6,8,"Goodbye"));
        hexad1.printGroup();
        var heptad1 = new Heptad<>(hexad1,32221.222);
        System.out.println("\n\n"+heptad1.retrieve(7).getClass());
        var octad = new Octad<>(testTriad2,testTriad, pair1);
        octad.printGroup();
    }
}