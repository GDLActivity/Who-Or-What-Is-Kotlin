package playground;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sierisimo on 3/14/17.
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        List<Foo> list1 = new LinkedList<>();
        list1.add(new Foo());
        list1.add(new Bar());

        //List<? extends Baz> list2 = new LinkedList<>();
        //list2.add(new Baz());
        //list2.add(new Foo());
        //list2.add(new Bar());

        List<? super Foo> list3 = new LinkedList<>();
        list3.add(new Foo());
        list3.add(new Bar());

        //Foo tF = (Foo) list3.get(0);
        //Bar tB = (Bar) list3.get(0);

        Foo f = new Bar();

        List<Bar> bList = new LinkedList<>();
        //List<Foo> fList = bList; <-- Invalid for producer-consumer problems.
    }

    static class Baz {

    }

    static class Foo extends Baz{
        public void doAThing() {
        }
    }

    static class Bar extends Foo {
        public void doSomething() {

        }
    }
}
