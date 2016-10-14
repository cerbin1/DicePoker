class Game {

    private Player firstPlayer = new Player();
    private Player secondPlayer = new Player();
    private ScoreChecker checkFirstPlayersScore = new ScoreChecker();
    private ScoreChecker checkSecondPlayerScore = new ScoreChecker();

    void run() {
        firstPlayer.randomDices();
        secondPlayer.randomDices();
        checkFirstPlayersScore.groupDicesNumbers(firstPlayer);
        Console.displayDicesResults(firstPlayer, checkFirstPlayersScore);
        Console.displayDicesResults(secondPlayer, checkSecondPlayerScore);
        checkFirstPlayersScore.checkScore();
        checkSecondPlayerScore.checkScore();
    }
}
