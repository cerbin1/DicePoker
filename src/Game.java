class Game {

    Player firstPlayer = new Player();
    Player secondPlayer = new Player();

    void run() {
        firstPlayer.randomDices();
        secondPlayer.randomDices();
        Console.displayDicesResult(firstPlayer);
    }
}
