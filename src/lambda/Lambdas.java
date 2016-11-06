package lambda;

/**
 * Created by sierisimo on 11/6/16.
 */
public class Lambdas {
    public static void main(String[] args) {
        SomeClass myObject = new SomeClass();

        myObject.printSomething((x, y) -> x + y);
    }
}
