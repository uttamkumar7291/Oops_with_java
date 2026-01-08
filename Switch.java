//indroduce a switch statement without using break keyword
//-----------------------------------------------------code with  Er. uttam kumar---------------------------------------------------------------
public class Switch {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Weekend";
        };
        System.out.println(dayName);
    }
}
