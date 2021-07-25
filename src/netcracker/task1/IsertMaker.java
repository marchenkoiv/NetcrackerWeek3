package netcracker.task1;

public class IsertMaker {

    /**
     * It creates SQL INSERT statement which inserts rows from T_Student to T_GroupSelected
     * if the conditions are met
     * @param group is group of a student from T_Student
     * @param dolg is number of debts of a student from T_Student
     * @return SQL INSERT statement
     */
    public static String createInsert(String group, int dolg){
        StringBuilder sb = new StringBuilder();
        sb.append("ISERT INTO T_GroupSelected\n(id_Student, firstName, lastName, id_Group)\nVALUES\n")
                .append("id_Student, firstName, lastName, id_Group\nFROM T_Student\nWHERE ")
                .append("id_Group = '")
                .append(group)
                .append("' AND dolgCount > ")
                .append(dolg)
                .append(';');
        return new String(sb);
    }

    public static void main(String[] args){
        System.out.println(IsertMaker.createInsert("2021", 5));
    }
}
