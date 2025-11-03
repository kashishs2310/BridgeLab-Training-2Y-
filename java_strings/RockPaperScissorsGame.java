import java.util.*;

public class RockPaperScissorsGame {

    // Method to find computer choice using Math.random()
    static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0, 1, or 2
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";
        }
    }

    // Method to find the winner between user and computer
    static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    // Method to calculate average and percentage of wins
    static String[][] calculateStats(int playerWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[2][3];
        double playerWinPercent = ((double) playerWins / totalGames) * 100;
        double computerWinPercent = ((double) computerWins / totalGames) * 100;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerWinPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerWinPercent);

        return stats;
    }

    // Method to display the results
    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\n---------------------------------------------");
        System.out.println("Game\tUser Choice\tComputer Choice\tResult");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        System.out.println("\n----------- Summary -----------");
        System.out.println("Player/Computer\tWins\tWin Percentage");
        System.out.println("-------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i][1] + "\t\t" + stats[i][2]);
        }
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();

        String[][] results = new String[totalGames][3];
        int playerWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = sc.next().toLowerCase();

            String computerChoice = getComputerChoice();
            String result = findWinner(userChoice, computerChoice);

            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = result;

            if (result.equals("Player Wins")) {
                playerWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        // Calculate and display stats
        String[][] stats = calculateStats(playerWins, computerWins, draws, totalGames);
        displayResults(results, stats);
    }
}
