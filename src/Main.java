import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть свій вибір. 1 - Rock, 2 - Paper, 3 - Scissors, 4 - Spock, 5 - Lizard");
        int choose = scanner.nextInt();
        while(choose <= 0 || choose >= 6){
            System.out.println("Введіть правильне число");
            System.out.println("Введіть свій вибір. 1 - Rock, 2 - Paper, 3 - Scissors, 4 - Spock, 5 - Lizard");
            choose = scanner.nextInt();
        }
        int bot = random.nextInt(5) + 1;
        System.out.println("Вибір бота:");
        switch (bot) {
            case 1 ->
                System.out.println("Rock");
            case 2 ->
                System.out.println("Paper");
            case 3 ->
                System.out.println("Scissors");
            case 4 ->
                System.out.println("Spock");
            case 5 ->
                System.out.println("Lizard");
        }
        if (bot == choose){
            System.out.println("Нічия!");
            return;
        }
        switch (choose) {
            case 1 -> {
                if (bot == 3 || bot == 5)
                    System.out.println("Ви перемогли!");
                if (bot == 2 || bot == 4)
                    System.out.println("Ви програли!");
            }
            case 2 -> {
                if (bot == 1 || bot == 4)
                    System.out.println("Ви перемогли!");
                if (bot == 5 || bot == 3)
                    System.out.println("Ви програли!");
            }
            case 3 -> {
                if (bot == 2 || bot == 5)
                    System.out.println("Ви перемогли!");
                if (bot == 4 || bot == 1)
                    System.out.println("Ви програли!");
            }
            case 4 -> {
                if (bot == 1 || bot == 3)
                    System.out.println("Ви перемогли!");
                if (bot == 5 || bot == 2)
                    System.out.println("Ви програли!");
            }
            case 5 -> {
                if (bot == 4 || bot == 2)
                    System.out.println("Ви перемогли!");
                if (bot == 1 || bot == 3)
                    System.out.println("Ви програли!");
            }
        }
    }
}