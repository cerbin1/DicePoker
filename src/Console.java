import java.util.concurrent.TimeUnit;

class Console {
    static void displayDicesResults(Dices player) {
        System.out.println(player.getPlayersName() + " rzucil: ");
        int[] diceNumbers = player.getDices();
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.print(diceNumbers[i]);
            } else {
                System.out.print(diceNumbers[i] + ", ");
            }
        }
        System.out.println();
    }

    static void displayDrawn() {
        System.out.println("Remis");
    }

    static void displayPlayerWin(String name) {
        System.out.println(name + " wygral!!!");
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

    static void displayScoreInfo() {
        System.out.println("Sprawdzam wynik...");
        setTimeOut();
    }

    static void setTimeOut() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.err.println("Cos sie popsulo");
        }
    }

    static void displayErrorInterruptedException() {
        System.err.println("Something went wrong!");
    }
}
