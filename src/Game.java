class Game {

    Player firstPlayer = new Player();
    Player secondPlayer = new Player();

    ScoreChecker checkScore = new ScoreChecker();

    void run() {
        firstPlayer.randomDices();
        secondPlayer.randomDices();
        Console.displayDicesResult(firstPlayer);
        checkScore.checkPairs(firstPlayer);
        
    }
}
