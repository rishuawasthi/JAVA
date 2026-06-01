enum status{
    SUCCESS,FAILURE,IN_PROGRESS
}
public class enum_demo {
    public static void main(String[] args) {
        status s1 = status.SUCCESS;
        status s2 = status.FAILURE;
        status s3 = status.IN_PROGRESS;

        System.out.println("Status 1: " + s1);
        System.out.println("Status 2: " + s2);
        System.out.println("Status 3: " + s3);
        status s4 []=status.values();//returns an array of all the constants in the enum
        for(status s:s4){
            System.out.println(s);
        }
        System.out.println("Ordinal of SUCCESS: " + s1.ordinal());//returns the position of the constant in the enum
        System.out.println("Ordinal of FAILURE: " + status.valueOf("FAILURE").ordinal());//returns the position of the constant in the enum


    }
}