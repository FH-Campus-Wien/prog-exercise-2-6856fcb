package at.ac.fhcampuswien;
import java.util.Locale;
import java.util.Scanner;

public class App {



    //todo Task 1
    public void largestNumber() {

        double CurrentLargest = 0;
        double Input = 0;
        Scanner DScanner = new Scanner(System.in);

        for (int i = 1; i >= 1; i++) {
            System.out.print("Number " + i + ": ");
            double Number = DScanner.nextDouble();

            if (i == 1) {
                Input = Number;

                if (Number <= 0) {
                    System.out.println("No number entered.");

                    break;
                }
            }

            if (Number >= Input) {
                CurrentLargest = Number;
            }

            if (Number <= 0) {
                System.out.println("The largest number is " + String.format(Locale.ENGLISH, "%,.2f", CurrentLargest));

                break;
            }
        }
    }
    //todo Task 2
    public void stairs() {
        int Number = 1;
        Scanner DScanner = new Scanner(System.in);
        System.out.print("n: ");
        int NumberScanned = DScanner.nextInt();

        if (NumberScanned <= 0) {
            System.out.println("Invalid number!");
        }

        for (int i = 1; i <= NumberScanned; i++) {

            for (int j = 1 + NumberScanned; j <= NumberScanned + i; j++) {
                System.out.print(Number + " ");
                Number++;
            }
            System.out.println();

        }

    }



    //todo Task 3
    public void printPyramid() {

        int Rows = 6;

        for (int x = 1; x <= Rows; x++) {

            for (int y = 1; y <= Rows - x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= x * 2 - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {

        Scanner ScanMASTER400 = new Scanner(System.in);

        System.out.print("h: ");
        int h = ScanMASTER400.nextInt();
        System.out.print("c: ");
        char c = ScanMASTER400.next().charAt(0);

        if (h % 2 == 0) {
            // if (h % 2 == 0 &&

            System.out.println("Invalid number!");

        } else {

            for (int i = 0; i < h / 2; i++) {
                for (int k = h - i; k > h / 2 + 1; k--) {
                    System.out.print(" ");
                }


                for (int j = i; j > 0; j--) {
                    System.out.print((char) (c - j));
                }
                System.out.print(c);
                for (int j = 1; j < i + 1; j++) {
                    System.out.print((char) (c - j));
                }
                System.out.println();
            }

            //int i = h / 2; i >=0
            for (int i = h / 2; i >= 0; i--) {
                for (int k = h - i; k > h / 2 + 1; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j > 0; j--) {
                    System.out.print((char) (c - j));
                }
                System.out.print(c);
                for (int j = 1; j < i + 1; j++) {
                    System.out.print((char) (c - j));
                }
                System.out.println();
            }
            }
        }



    //todo Task 5
    public void marks() {

        double Gesamt = 0.00;
        int GradeIndex = 1;
        int NegativeGesamt = 0;
        int i = 0;

        Scanner Scanmax = new Scanner(System.in);

        while (GradeIndex > 0) {
            System.out.print("Mark " + GradeIndex + ": ");
            double input = Scanmax.nextInt();

            if (input >= 1 && input <= 5) {
                Gesamt += input;
                GradeIndex++;

            } else if (input == 0) {
                i = GradeIndex - 1;
                GradeIndex = -1;

            } else {
                System.out.println("Invalid mark!");
            }

            if (input == 5) {
                NegativeGesamt++;
            }
        }

        if (GradeIndex == -1) {
            if (Gesamt != 0) {
                Gesamt /= i;
            }
            System.out.printf("Average: %.2f", Gesamt);
            System.out.println(System.lineSeparator()+"Negative marks: " + NegativeGesamt);
        }
    }

    //todo Task 6
    public void happyNumbers() {

        Scanner ScannerA = new Scanner(System.in);
        System.out.print("n: ");

        int input = ScannerA.nextInt();
        int sum = 0;
        int A = 1;
        int numb = input;

        while (sum != 4 && sum != 1) {
            sum = 0;
            while (numb > 0) {
                A = numb % 10;
                sum = sum + (A * A);
                numb /= 10;
            }
            numb = sum;
        }
        if (sum == 1) {

            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }



    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
