public class conditionals {
    static void main() {
//        conditional statements
//        1. If- statement
        int dailyPractice = 12;
        if(dailyPractice>=10){
            System.out.println("Good Consistency");
        }

//       2. If-Else statement
        int score = 42;
        if(score>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

//       3.If-Else-If statement
        int accuracy = 78;
        if(accuracy>=90){
            System.out.println("Excellent");
        } else if (accuracy >=75) {
            System.out.println("Good");
        } else if (accuracy>=50) {
            System.out.println("Average");
        }else{
            System.out.println("Need improvement");
        }

//       4. Nested If-Else statement
        boolean hasSubscription = true;
        int solvedProblems = 120;
        if(hasSubscription) {
            if (solvedProblems >= 200) {
                System.out.println("Unlock advanced sheets");
            } else {
                System.out.println("solve more problems");
            }
        }else {
            System.out.println("Upgrade to premium");
        }

//       5. Ternary operator
        int streakDays = 32;
        String status = (streakDays>=40)?"Consistent":"Irregular";
        System.out.println(status);

//        6. Switch statement
        int level = 2;
        switch(level){
            case 1:
                System.out.println("Beginner");
                break;
            case 2:
                System.out.println("Intermediate");
                break;
            case 3:
                System.out.println("Advanced");
                break;
            default:
                System.out.println("Not a participant");
        }
    }
}
