package Chapter1;

public class Compiler {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
            x += 1;
        }
    }
}


class Compiler2 {
    public static void main(String[] args) {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }
        }
    }
}


class Compiler3 {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }

        }
    }
}