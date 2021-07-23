package Inheritance;

import lombok.Getter;
import lombok.Setter;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Worker extends Human implements Comparable<Worker> {

    private String name;
    private String socialSecurityId;

    // Interface MyAnnotation { }
    // Worker::move implements MyAnnotation

    @MyAnnotation
    @Override
    public void move() {
        System.out.println("worker rides bus to work");
    }

    public void work() throws Exception {
        System.out.println( this.getName() + " worker works");
    }

    @Override
    public int compareTo(Worker worker) {
        return this.getSocialSecurityId().compareTo( worker.getSocialSecurityId() );
    }

    public void refect() throws ClassNotFoundException {
        Class selfClass = Class.forName("Inheritance.Worker");

        System.out.println( "Class to inspect: "+ selfClass.getSimpleName() );
        Annotation[] annotations = selfClass.getAnnotations();

        Iterator ii = Arrays.stream(annotations).iterator();

        for ( Annotation annotation : annotations ) {
            System.out.println( "Annotated as: " + annotation.toString() );
        }

        Field[] fields = selfClass.getFields();
        for ( Field field : fields ) {
            System.out.println( "Fields as: " + field.toString() );
        }

        try {
            Worker worker = (Worker) selfClass.getDeclaredConstructor().newInstance();
            Method isPrototypeMethod = selfClass.getDeclaredMethod("work");

            /*
            *
            *  Worker dummy = new Worker( "", "" );
            *  dummy.setName( "Dummy" );
            *  dummy.work();
            *
            * */

            worker.setName( "Dummy" );
            isPrototypeMethod.setAccessible(true);

            System.out.println("Send: " + worker.getName() + " to " + isPrototypeMethod.getName() + ":" );
            isPrototypeMethod.invoke( worker );

        } catch (InstantiationException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
