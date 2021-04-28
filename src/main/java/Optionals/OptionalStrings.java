package Optionals;

//Importing Optional class
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OptionalStrings
{
    public static void main(String[] args) {

        String[] str = new String[10];

        System.out.println( str[9] );
        Optional<String> isNull1 = Optional.ofNullable( str[9] );

        if( isNull1.isPresent() ) {


            //Getting the substring
            String str2 = str[9].substring(2, 5);
            //Displaying substring
            System.out.print("Substring is: "+ str2);
        }
        else{
            System.out.println("Cannot get the substring from an empty string");
        }

        str[9] = "JavaRemoteLT8";

        Optional<String> isNull2 = Optional.ofNullable( str[9] );

        if( isNull2.isPresent() ){
            //Getting the substring
            String str2 = str[9].substring(2, 5);
            //Displaying substring
            System.out.print("Substring is: "+ str2 + "\n");
        }

        else{
            System.out.println("Cannot get the substring from an empty string");
        }

        isNull2.ifPresent( System.out::println );
        isNull1.ifPresent( System.out::println );

        Optional [] allOptionals = new Optional[ 2 ];

        allOptionals[0] = isNull1;
        allOptionals[1] = isNull2;

        List< Optional > asList = Arrays.asList( allOptionals );
        asList.forEach( optional -> System.out.println( optional.isPresent() + " " + optional ) );

        final Consumer<Optional> onlyPresent = optional -> {

            if ( optional.isPresent() ) {
                System.out.println("Value: " + optional);
            }
        };

        Arrays.stream( allOptionals ).forEach( onlyPresent );
        System.out.println( Arrays.stream( allOptionals ).count() + " elements total" );
        System.out.println( asList.stream().filter( Optional::isPresent ).count() + " present elements" );

        List<Optional> asPresentOnly = asList.stream()
                .filter( Optional::isPresent )
                .collect(Collectors.toList());

        System.out.println( "List consists of " + asPresentOnly.size() + " present elements" );

    }
}