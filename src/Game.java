class Game {

    private Player firstPlayer = new Player();
    private Player secondPlayer = new Player();
    private ScoreChecker checkScore = new ScoreChecker();

    void run() {
        firstPlayer.randomDices();
        secondPlayer.randomDices();
        Console.displayDicesResult(firstPlayer);
        checkScore.checkPairs(firstPlayer);

    }
}
