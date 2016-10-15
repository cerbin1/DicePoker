import java.util.Scanner;

class Game {

    private Dices firstPlayer = new Dices();
    private Dices secondPlayer = new Dices();
    private DiceGrouper diceGrouper = new DiceGrouper();
    private Scanner scanner = new Scanner(System.in);


    void run() {

        startTheDraw(firstPlayer, "Pierwszy");
        startTheDraw(secondPlayer, "Drugi");


        Console.displayScoreInfo();
        Console.displayDicesResults(firstPlayer);

        Console.displayScoreInfo();
        Console.displayDicesResults(secondPlayer);

        GroupedDice first = diceGrouper.groupDicesNumbers(firstPlayer);
        first.checkScore();

        GroupedDice second = diceGrouper.groupDicesNumbers(secondPlayer);
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
