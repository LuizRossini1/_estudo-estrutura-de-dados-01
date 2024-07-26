package DataStructure.Array;

public class ArrayTest {
    public static void main(String[] args) {
        var car1 = new Car("BMW");
        var car2 = new Car("Ferrai");

        var list = new Array();

        list.adding(car1);
        list.adding(car2);

        System.out.println("Total indexes: " +list.show());
        System.out.println("Indexes: " +list);
    }
}