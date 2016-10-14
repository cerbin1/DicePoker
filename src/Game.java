class Game {

    private Player firstPlayer = new Player();
    private Player secondPlayer = new Player();
    private ScoreChecker checkScore = new ScoreChecker();

    void run() {
        firstPlayer.randomDices();
        secondPlayer.randomDices();
        checkScore.checkPairs(firstPlayer);
        Console.displayDicesResult(firstPlayer, checkScore);

    }
}
