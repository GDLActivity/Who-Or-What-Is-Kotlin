package lambda;

/**
 * Created by sierisimo on 11/6/16.
 */
public class SomeClass {
    public void printSomething(SomeInterface someImplementingObject) {
        int z = someImplementingObject.doSomething(1, 3);
        System.out.println(z);
    }
}
