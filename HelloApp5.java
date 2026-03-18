public class HelloApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            // No arguments
            System.out.println("Hello, World!");
        } else if (args.length == 1) {
            // One argument
            System.out.println("Hello, " + args[0] + "!");
        } else {
            // Multiple arguments
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}