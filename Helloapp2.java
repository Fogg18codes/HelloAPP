public class Helloapp2 {
    public static void main(String[] args) {

        String name;

        // Check if argument is provided
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}