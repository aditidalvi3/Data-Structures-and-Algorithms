class Patterns {

    public void pattern1(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns patterns = new Patterns(); // Patterns is the object name
        int N = 5;

        System.out.println("Pattern 1:"); // .pattern1 is the method name
        patterns.pattern1(N);

        System.out.println("\nPattern 2:"); // we can use the same object to call another method
        patterns.pattern2(N);
    }
}
