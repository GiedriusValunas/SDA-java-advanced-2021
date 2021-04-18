package Generics;

import Inheritance.Human;
import Inheritance.OfficeWorker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@ToString
public class GenericBox< T extends Comparable<T> > {   // public class GenericBox< T > {
    // Placeholder for ANY type: T(ype). K(ey). V(alue)

    private final List<T> items = new LinkedList<>();
    private T item;

    public GenericBox(T item) {
        this.item = item;
        items.add(item);
    }

    // Unbounded Wildcards
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }

    // Unbounded Wildcards, but generic enough
    public static void printCollection(Collection<?> collection) {
        for (Object element : collection) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void printItems() {

        Iterator<T> ii = items.iterator();

        while (ii.hasNext()) {
            System.out.print(ii.next() + " ");
        }
        System.out.println();

/*        for ( T item : items ) {
            System.out.println( item );
        }
*/
    }

    // Lower-bounded Wildcards
    public void printHumans(List<? extends Human> list) {
        Iterator<T> ii = (Iterator<T>) list.iterator();

        while (ii.hasNext()) {
            System.out.print(ii.next() + " ");
        }
        System.out.println();
    }

    // Upper-bounded Wildcards
    public void printWorkers( List<? super OfficeWorker> list ) {
        Iterator<? super OfficeWorker> ii = list.iterator();

        while (ii.hasNext()) {
            System.out.print(ii.next() + " ");
        }
        System.out.println();
    }

}


