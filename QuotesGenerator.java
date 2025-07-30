import java.util.Random;
import java.util.Scanner;

public class QuotesGenerator {
    public static void main(String[] args) {
        String[] compliments = {
            "You're amazing just as you are 💫",
            "You light up the room 🌟",
            "You have a brilliant mind 🧠",
            "You're doing great, keep going 🚀",
            "Your smile is contagious 😄",
            "You're stronger than you think 💪",
            "You’re like sunshine on a rainy day ☀️",
            "You are enough, just as you are 🧡"
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🌸 Welcome to the Compliment Generator!");
        System.out.print("Press Enter to receive a compliment...");

        scanner.nextLine(); // waits for Enter

        int index = random.nextInt(compliments.length);
        System.out.println("\n💖 " + compliments[index]);
    }
}
