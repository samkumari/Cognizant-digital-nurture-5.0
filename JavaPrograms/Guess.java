import java.util.*;

class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int num = rand.nextInt(100) + 1;
        int guess;

        do {
            guess = sc.nextInt();

            if(guess < num)
                System.out.println("Too low");
            else if(guess > num)
                System.out.println("Too high");

        } while(guess != num);

        System.out.println("Correct!");
    }
}