package netcracker.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Class of phone number
 * Use the constructor to set right arguments
 */
public class PhoneNumber {
    private final String code;
    private final String number;


    /**
     * Constructor for PhoneNumber
     * If input string is incorrect, it trows an exception
     * It uses regular expressions with their groups
     * @param number is String with pattern "(\\+(\\d+)|8)((\\d){10})"
     */
    public PhoneNumber(String number){
        Pattern pattern = Pattern.compile("(\\+(\\d+)|8)((\\d){10})");
        Matcher matcher = pattern.matcher(number);
        if(matcher.matches()){
            this.number = matcher.group(3);
            if (matcher.group(2) == null){
                code = "7";
            } else{
                code = matcher.group(2);
            }
        } else {
            throw new IllegalArgumentException("Illegal Phone Number");
        }
    }
    /**
     * override toString for PhoneNumber
     * @return String of like +<code><number[0-2]>-<number[3-5]>-<number[6-9]>
     */
    @Override
    public String toString(){
        return '+' + code + number.substring(0, 3) + '-' + number.substring(3, 6) + '-' +number.substring(6);
    }


    public static void main(String[] args){
        PhoneNumber phone1 = new PhoneNumber("+79175655655");
        System.out.println(phone1.toString());
        phone1 = new PhoneNumber("+104289652211");
        System.out.println(phone1.toString());
        phone1 = new PhoneNumber("89175655655");
        System.out.println(phone1.toString());
    }

}
