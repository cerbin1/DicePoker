import java.util.Scanner;

class Game {

    private Dices firstPlayer = new Dices();
    private Dices secondPlayer = new Dices();
    private ScoreChecker checkFirstPlayersScore = new ScoreChecker();
    private ScoreChecker checkSecondPlayerScore = new ScoreChecker();
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Console.askForName("Pierwszy");
        firstPlayer.setPlayersName(scanner.nextLine());
        firstPlayer.randomDices();
        checkFirstPlayersScore.groupDicesNumbers(firstPlayer);
        Console.displayDicesResults(firstPlayer, checkFirstPlayersScore);
        checkFirstPlayersScore.checkScore();

        Console.askForName("Drugi");
        secondPlayer.setPlayersName(scanner.nextLine());
        secondPlayer.randomDices();
        checkSecondPlayerScore.groupDicesNumbers(secondPlayer);
        Console.displayDicesResults(secondPlayer, checkSecondPlayerScore);
        checkSecondPlayerScore.checkScore();

        checkWhoWins();

    }

    private void checkWhoWins() {
        if (checkFirstPlayersScore.getPowerOfScore() == checkSecondPlayerScore.getPowerOfScore()) {
            Console.displayDrawn();
        } else if (checkFirstPlayersScore.getPowerOfScore() > checkSecondPlayerScore.getPowerOfScore()) {
            Console.displayPlayerWin();
        } else {
            Console.displayPlayerWin();
        }
    }
}
