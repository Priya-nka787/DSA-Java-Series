public class Variables {
    static void main() {
//        main is not a reserved keyword, it is an identifier.
        int main = 15;
        System.out.println("Main:" + main);
//        camelCase and initialization of variable with defining it.
        int totalMarks = 20;
        System.out.println(totalMarks);
//        Case-sensitive
        int weight = 80;
        int WEIGHT = 70;
        System.out.println("Weight:" +weight);
        System.out.println("Weight:" +WEIGHT);
//        Constants
        int DAYS_IN_YEAR =365;
        System.out.println(DAYS_IN_YEAR);
    }
}
