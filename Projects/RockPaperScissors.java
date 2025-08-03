//FOR USER 1 VS USER 2 
package Projects;

// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner se = new Scanner(System.in);
        
//         String user1 = se.nextLine();
//         String user2 = se.nextLine();
        
//         if(user1.equals("rock") && user2.equals("scissor") || user1.equals("paper") && user2.equals("rock") || user1.equals("scissor") && user2.equals("paper")) {
//             System.out.print("The Winner is User1");
//         } else if(user1.equals("rock") && user2.equals("rock") || user1.equals("scissor") && user2.equals("scissor") || user1.equals("paper") && user2.equals("paper")) {
//             System.out.print("Its a draw");
//         } else {
//             System.out.print("The winner is User2");
//         }
//     }
// }









//FOR 1 USER VS COMPUTER





import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
      
        String[] options = {"rock", "paper", "scissors"};
        
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        String userChoice = input.nextLine().toLowerCase();
        
        while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice! Please enter 'rock', 'paper', or 'scissors': ");
            userChoice = input.nextLine().toLowerCase();
        }
        
        int randomIndex = rand.nextInt(3); 
        String computerChoice = options[randomIndex];
        
        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
