package Aggregation;

public class WalkTheDog {

    public static void main(String[] args) {

        Dog spotty = new Dog( 7, 5 );

        // Variant one
        spotty.setMuzzle( new Muzzle( 4 ) );
        System.out.println( "Dog of age: " + spotty.getAge() + " wears " + spotty.getMuzzle() );

        Dog eira = new Dog( 16, 10 );

        final Muzzle muzzle = new Muzzle( 0 );
        muzzle.setMaterial( "IRON" );
        muzzle.setSize( 3 );

        eira.setMuzzle( muzzle );
        System.out.println( "Dog of age: " + eira.getAge() + " wears " + eira.getMuzzle() );

        eira = new Dog( 16, 10, new Muzzle( 5 ) );
        System.out.println( "Eira, dog of age: " + eira.getAge() + " wears " + eira.getMuzzle() );

        eira = new Dog( 16, 10, muzzle );
        System.out.println( "Eira, dog of age: " + eira.getAge() + " wears " + eira.getMuzzle() );

    }

}
