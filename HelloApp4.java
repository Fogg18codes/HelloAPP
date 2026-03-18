public class HelloApp4 {

    public static void main(String[] args) {

        // If no arguments → default
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all arguments with comma and space
            String result = String.join(", ", args);
            System.out.println("Hello, " + result + "!");
        }
    }
}