import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Game {

    private Dices firstPlayer = new Dices();
    private Dices secondPlayer = new Dices();
    private ScoreChecker checkFirstPlayersScore = new ScoreChecker();
    private ScoreChecker checkSecondPlayerScore = new ScoreChecker();
    private Scanner scanner = new Scanner(System.in);

    void run() throws InterruptedException {

        startTheDraw(firstPlayer, "Pierwszy");
        startTheDraw(secondPlayer, "Drugi");


        Console.displayScoreInfo();
        checkFirstPlayersScore.groupDicesNumbers(firstPlayer);
        Console.displayDicesResults(firstPlayer);
        checkFirstPlayersScore.checkScore();

        checkSecondPlayerScore.groupDicesNumbers(secondPlayer);
        Console.displayDicesResults(secondPlayer);
        checkSecondPlayerScore.checkScore();

        checkWhoWins();
    }

    private void startTheDraw(Dices player, String whichPlayer) {
        Console.askForName(whichPlayer);
        player.setPlayersName(scanner.nextLine());
        Console.helloMessage(player);
        try {
            TimeUnit.SECONDS.sleep(0);
        } catch (InterruptedException e) {
            Console.displayErrorInterruptedException();
        }
        player.randomDices();
        Console.displayDrawDicesIsDone();
    }

    private void checkWhoWins() {
        if (checkFirstPlayersScore.getPowerOfScore() == checkSecondPlayerScore.getPowerOfScore()) {
            Console.displayDrawn();
        } else if (checkFirstPlayersScore.getPowerOfScore() > checkSecondPlayerScore.getPowerOfScore()) {
            Console.displayPlayerWin(firstPlayer.getPlayersName());
        } else {
            Console.displayPlayerWin(secondPlayer.getPlayersName());
        }
    }
}
