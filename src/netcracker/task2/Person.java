package netcracker.task2;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;

    public Person(String lastName, String firstName, String middleName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Person(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = null;
    }

    public Person(String lastName){
        this.lastName = lastName;
        this.middleName = null;
        this.firstName = null;
    }

    public String toString() {
        if(firstName != null){
            StringBuilder sb = new StringBuilder();
            if(middleName != null) {
                sb.append(lastName);
                sb.append(" ");
                sb.append(firstName.charAt(0));
                sb.append(".");
                sb.append(middleName.charAt(0));
                sb.append(".");
                return new String(sb); // return lastName + ' ' + firstName.charAt(0) + '.' + middleName.charAt(0) + '.'
            }
            sb.append(lastName);
            sb.append(" ");
            sb.append(firstName.charAt(0));
            sb.append(".");
            return new String(sb); // return lastName + ' ' + firstName.charAt(0) + '.'
        }
        return lastName; // return lastName
    }


    public static void main(String[] args){
        long startTime = System.nanoTime();{
            Person pers1 = new Person("Ivanov", "Ivan", "Ivanovich");
            Person pers2 = new Person("Andreev", "Andrei");
            Person pers3 = new Person("Petrov");
            System.out.println(pers1.toString());
            System.out.println(pers2.toString());
            System.out.println(pers3.toString());
        }
        long time = System.nanoTime() - startTime;
        System.out.println(time);
    }
}
