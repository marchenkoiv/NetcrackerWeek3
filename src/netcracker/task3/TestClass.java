package netcracker.task3;

/**
 * test class for  Address class
 */

public class TestClass {
    public static void main(String[] args){
        Address adr = new Address();
        adr.setAddressSplit("Россия,    Москва, Москва   , Каширское шоссе, 31   , 12, 215");
        System.out.println(adr.toString());
        adr.setAddressTokenizer("Россия  , Москва, Москва   , Каширское шоссе,   31, 12, 215   ");
        System.out.println(adr.toString());
        adr.setAddressTokenizer("Россия  . Москва. Москва   . Каширское шоссе.   31. 12. 215   ");
        System.out.println(adr.toString());
        adr.setAddressTokenizer("Россия  . Москва, Москва   - Каширское шоссе,   31- 12; 215   ");
        System.out.println(adr.toString());
        adr.setAddressSplit("Россия  . Москва,  215   ");
        System.out.println(adr.toString());
    }
}
