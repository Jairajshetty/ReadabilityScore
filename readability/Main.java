package readability;
import java.io.IOException;
import java.lang.reflect.AnnotatedArrayType;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {



        try {
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);
            String text = scanner.nextLine();
            String[] sentenses = text.split("[.?!][.]?");
            String[] worlds = text.split(" ");
            String[] characters = text.split("");
            String[] countSpaces = text.split(" ");
            double charactersCount = characters.length - (countSpaces.length - 1);
            double worldsCount = worlds.length;
            double sentensesCount = sentenses.length;
            System.out.println("Words: " + (int) worldsCount);
            System.out.println("Sentences: " + (int) sentensesCount);
            System.out.println("Characters: " + (int) charactersCount);

            double score = 0.0;
            if (sentensesCount > 1) {
                score = 4.71 * charactersCount / worldsCount + 0.5 * worldsCount / sentensesCount - 21.43;
            }
            System.out.printf("The score is: %.2f \n", score);
            switch ((int) Math.ceil(score)) { // i use 0.25 for round of and then i convert it into int
                case 1:
                    System.out.println("This text should be understood by 5-6 year olds.");
                    break;
                case 2:
                    System.out.println("This text should be understood by 6-7 year olds.");
                    break;
                case 3:
                    System.out.println("This text should be understood by 7-9 year olds.");
                    break;
                case 4:
                    System.out.println("This text should be understood by 9-10 year olds.");
                    break;
                case 5:
                    System.out.println("This text should be understood by 10-11 year olds.");
                    break;
                case 6:
                    System.out.println("This text should be understood by 11-12 year olds.");
                    break;
                case 7:
                    System.out.println("This text should be understood by 12-13 year olds.");
                    break;
                case 8:
                    System.out.println("This text should be understood by 13-14 year olds.");
                    break;
                case 9:
                    System.out.println("This text should be understood by 14-15 year olds.");
                    break;
                case 10:
                    System.out.println("This text should be understood by 15-16 year olds.");
                    break;
                case 11:
                    System.out.println("This text should be understood by 16-17 year olds.");
                    break;
                case 12:
                    System.out.println("This text should be understood by 17-18 year olds.");
                    break;
                case 13:
                    System.out.println("This text should be understood by 18-24 year olds.");
                    break;
                case 14:
                    System.out.println("This text should be understood by 24+ year olds.");
                    break;
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}
