package DataStructure.Array;

public class ArrayTest {
    public static void main(String[] args) {
        var car1 = new Car("BMW");
        var car2 = new Car("Ferrai");
        var car3 = new Car("Troller");

        var list = new Array();

        list.adding(car1);
        list.adding(car2);

        System.out.println(list.have(car3));
        System.out.println(list.show());
        System.out.println(list);
    }
}