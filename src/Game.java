class Game {

    private Player firstPlayer = new Player();
    private Player secondPlayer = new Player();
    private ScoreChecker checkFirstPlayersScore = new ScoreChecker();
    private ScoreChecker checkSecondPlayerScore = new ScoreChecker();

    void run() {
        firstPlayer.randomDices();
        checkFirstPlayersScore.groupDicesNumbers(firstPlayer);
        Console.displayDicesResults(firstPlayer, checkFirstPlayersScore);
        checkFirstPlayersScore.checkScore();

        secondPlayer.randomDices();
        checkSecondPlayerScore.groupDicesNumbers(secondPlayer);
        Console.displayDicesResults(secondPlayer, checkSecondPlayerScore);
        checkSecondPlayerScore.checkScore();
    }
}
