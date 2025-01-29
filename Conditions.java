public class Conditions {
    public static void main(String[] args) {
        String day = "Monday";
        switch(day){
            case"Monday" -> System.out.println(day);

            case"Tuesday" -> System.out.println("day");

            case"Wednesday" -> {
                System.out.println("day");
            }

            case"Thursday" -> System.out.println(day);

            case"Friday" -> System.out.println("day");

            case"Saturday" -> System.out.println("day");

            default -> {
            }

        }
        
    }
    
}
