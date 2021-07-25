package netcracker.task3;
import java.util.StringTokenizer;

/**
 * Class of address
 * Uses to different setters for split() and StringTokenizer
 * You need to use them to set right arguments
 * Constructor is default
 */

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    /**
     * It sets Address, defined with string adr.
     * Uses split().
     * Parts of Address are divided by using ','
     * If input string is incorrect, it trows an exception
     * @param adr
     */
    public void setAddressSplit(String adr){
        String[] partAdr = adr.split(",");
        if (partAdr.length != 7){
            throw new IllegalArgumentException("Illegal Address");
        }
        country = partAdr[0].trim();
        region = partAdr[1].trim();
        city = partAdr[2].trim();
        street = partAdr[3].trim();
        house = partAdr[4].trim();
        building = partAdr[5].trim();
        flat = partAdr[6].trim();
    }

    /**
     * It sets Address, defined with string adr.
     * Uses StringTokenizer.
     * Parts of Address are divided by using ',', '.', ';', '-'
     * If input string is incorrect, it trows an exception
     * @param adr
     */

    public void setAddressTokenizer(String adr){
        StringTokenizer st = new StringTokenizer(adr, ".,-;");
        if (st.countTokens() != 7){
            throw new IllegalArgumentException("Illegal Address");
        }
        country = st.nextToken().trim();
        region = st.nextToken().trim();
        city = st.nextToken().trim();
        street = st.nextToken().trim();
        house = st.nextToken().trim();
        building = st.nextToken().trim();
        flat = st.nextToken().trim();
    }

    /**
     * override toString for Address
     * @return String of Address
     */
    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
