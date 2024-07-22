public class StackOverflowMain {
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive() {
        recursive();
    }
}
