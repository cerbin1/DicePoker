import java.util.concurrent.TimeUnit;

class Console {
    static void displayDicesResults(Dices player, ScoreChecker s) {
        System.out.println(player.getPlayersName() + " wylosowal: ");
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.print(player.getDices()[i]);
            }
            else {
                System.out.print(player.getDices()[i] + ", ");
            }
        }
        System.out.println();
    }

    static void displayDrawn() {
        System.out.println("remis");
    }

    static void displayPlayerWin() {
        System.out.println("Pierwszy gracz wygral");
    }

    static void askForName(String player) {
        System.out.print(player + " gracz, podaj imie: ");
    }

    static void helloMessage(Dices player) {

        System.out.println("Witaj " + player.getPlayersName() + ". Losuje dla Ciebie kosci...");
    }

    static void displayDrawDicesIsDone() {
        System.out.println("Kosci zostaly wylosowane!");
    }

    static void displayScoreInfo() throws InterruptedException {
        System.out.println("Sprawdzam wynik...");
        TimeUnit.SECONDS.sleep(0);
    }

    static void displayErrorInterruptedException() {
        System.err.println("Something went wrong!");
    }
}
