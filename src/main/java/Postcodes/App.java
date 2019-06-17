package Postcodes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Deserialiser deserialiser = new Deserialiser("resources/rates.json");
        System.out.println(deserialiser.ratesMapped.getPostcode());
        System.out.println(deserialiser.ratesMapped.getRegion());

    }
}
