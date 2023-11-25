import HGroups.*;


public class Main {
    public static void main(String[] args) {
        Triad<Integer, String, Double> testTriad = new Triad<>(1,"Hello", 7.5);
        Pentad<Integer, Double, String, Car, String> testPentad = new Pentad<>(1,3.14, "Hello World!", new Car("Beetle"),"Goodbye!");
        Pair pair1 = testTriad.get(1);
        pair1.printGroup();
        testPentad.printGroup();
        System.out.println("\n");
        int x = testTriad.retrieve(7);
        Car testCar= testPentad.retrieve(4);
        System.out.println(testCar.getName());
        System.out.println(x);
        double doubelFromTriad= testTriad.retrieve(3);
        System.out.println(doubelFromTriad*2);
        testTriad.printGroup();
        System.out.println();
        Hexad hexad1 = new Hexad<>(testTriad,new Triad<>(7,8,"Goodbye"));
        hexad1.printGroup();
    }
}