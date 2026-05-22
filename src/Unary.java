public class Unary {
    static void main() {
        int activeLearns = 30;

        int prefix = ++activeLearns;
        int postfix = activeLearns++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeLearns);

        int StudentInClass = 60;

        int ppostfix = StudentInClass--;
        int pprefix = --StudentInClass;

        System.out.println(ppostfix);
        System.out.println(pprefix);
        System.out.println(StudentInClass);
    }
}
