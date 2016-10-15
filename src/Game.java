import java.util.Scanner;

class Game {

    private Dices firstPlayer = new Dices();
    private Dices secondPlayer = new Dices();
    private ScoreChecker scoreChecker = new ScoreChecker();
    private Scanner scanner = new Scanner(System.in);


    void run() {

        startTheDraw(firstPlayer, "Pierwszy");
        startTheDraw(secondPlayer, "Drugi");


        Console.displayScoreInfo();
        Console.displayDicesResults(firstPlayer);

        Console.displayScoreInfo();
        Console.displayDicesResults(secondPlayer);

        GroupedDice first = scoreChecker.groupDicesNumbers(firstPlayer);
        first.checkScore();

        GroupedDice second = scoreChecker.groupDicesNumbers(secondPlayer);
        second.checkScore();

        if (first.checkScore() == second.checkScore()) {
            Console.displayDrawn();
        } else {
            if (first.checkScore() > second.checkScore()) {
                Console.displayPlayerWin(firstPlayer.getPlayersName());
            } else {
                Console.displayPlayerWin(secondPlayer.getPlayersName());
            }
        }
    }

    private void startTheDraw(Dices player, String whichPlayer) {
        Console.askForName(whichPlayer);
        player.setPlayersName(scanner.nextLine());
        Console.helloMessage(player);
        Console.setTimeOut();
        player.randomDices();
        Console.displayDrawDicesIsDone();
    }
}
