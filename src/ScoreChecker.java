class ScoreChecker {
    private int[] groupDiceNumbers = {0, 0, 0, 0, 0, 0};
    private int powerOfScore = 0; // TODO to pole do wyjebania

    void groupDicesNumbers(Dices player) { // TODO to powinno zwracać obiekt z pogrupowanymi kosciami, a nie zapisywac do pola
        for (int i = 0; i < 5; i++) {
            int[] diceNumbers = player.getDices();
            groupDiceNumbers[diceNumbers[i]]++;
        }
    }

    int getPowerOfScore() {
        return powerOfScore;
    }

    private boolean checkIfFull() { // TODO to do wyjebania, zrobić lepsza metode
        return ((groupDiceNumbers[0] == 3) && (groupDiceNumbers[1] == 2) || (groupDiceNumbers[0] == 3) && (groupDiceNumbers[2] == 2) || (groupDiceNumbers[0] == 3) && (groupDiceNumbers[3] == 2) ||
                (groupDiceNumbers[0] == 3) && (groupDiceNumbers[4] == 2) || (groupDiceNumbers[0] == 3) && (groupDiceNumbers[5] == 2) || (groupDiceNumbers[1] == 3) && (groupDiceNumbers[0] == 2) ||
                (groupDiceNumbers[1] == 3) && (groupDiceNumbers[2] == 2) || (groupDiceNumbers[1] == 3) && (groupDiceNumbers[3] == 2) || (groupDiceNumbers[1] == 3) && (groupDiceNumbers[4] == 2) ||
                (groupDiceNumbers[1] == 3) && (groupDiceNumbers[5] == 2) || (groupDiceNumbers[2] == 3) && (groupDiceNumbers[0] == 2) || (groupDiceNumbers[2] == 3) && (groupDiceNumbers[1] == 2) ||
                (groupDiceNumbers[2] == 3) && (groupDiceNumbers[3] == 2) || (groupDiceNumbers[2] == 3) && (groupDiceNumbers[4] == 2) || (groupDiceNumbers[2] == 3) && (groupDiceNumbers[5] == 2) ||
                (groupDiceNumbers[3] == 3) && (groupDiceNumbers[0] == 2) || (groupDiceNumbers[3] == 3) && (groupDiceNumbers[1] == 2) || (groupDiceNumbers[3] == 3) && (groupDiceNumbers[2] == 2) ||
                (groupDiceNumbers[3] == 3) && (groupDiceNumbers[4] == 2) || (groupDiceNumbers[3] == 3) && (groupDiceNumbers[5] == 2) || (groupDiceNumbers[4] == 3) && (groupDiceNumbers[0] == 2) ||
                (groupDiceNumbers[4] == 3) && (groupDiceNumbers[1] == 2) || (groupDiceNumbers[4] == 3) && (groupDiceNumbers[2] == 2) || (groupDiceNumbers[4] == 3) && (groupDiceNumbers[3] == 2) ||
                (groupDiceNumbers[4] == 3) && (groupDiceNumbers[5] == 2) || (groupDiceNumbers[5] == 3) && (groupDiceNumbers[0] == 2) || (groupDiceNumbers[5] == 3) && (groupDiceNumbers[1] == 2) ||
                (groupDiceNumbers[5] == 3) && (groupDiceNumbers[2] == 2) || (groupDiceNumbers[5] == 3) && (groupDiceNumbers[3] == 2) || (groupDiceNumbers[5] == 3) && (groupDiceNumbers[4] == 2)
        );
    }

    // TODO ta metoda powinna byc w obiekcie z pogrupowanymi kosciami
    // TODO ta metoda powinna zwracac score, a nie zapisywac do pola
    void checkScore() { // TODO to cała refactorowania
        for (int i = 0; i <= 5; i++) {
            if (groupDiceNumbers[i] == 5) {
                System.out.println("Poker z " + i);
                powerOfScore = 8;
                return;
            } else if (groupDiceNumbers[i] == 4) { // TODO jak robisz returna w poprzednim ifie, to nie musisz else (bo i tak wyjdzie)
                System.out.println("Kareta z " + i);
                powerOfScore = 7;
                return;
            } else if (checkIfFull()) {
                System.out.println("Full");
                powerOfScore = 6;
                return;
            } else if ((groupDiceNumbers[0] == 1) && (groupDiceNumbers[1] == 1) && (groupDiceNumbers[2] == 1) && (groupDiceNumbers[3] == 1) && (groupDiceNumbers[4] == 1)) {
                System.out.println("Maly street");
                powerOfScore = 5;
                return;
            } else if ((groupDiceNumbers[1] == 1) && (groupDiceNumbers[2] == 1) && (groupDiceNumbers[3] == 1) && (groupDiceNumbers[4] == 1) && (groupDiceNumbers[5] == 1)) {
                System.out.println("Duzy street");
                powerOfScore = 4;
                return;
            } else if (groupDiceNumbers[i] == 3) {
                System.out.println("Trojka z " + i);
                powerOfScore = 3;
                return;
            } else if ((groupDiceNumbers[0] == 2) && (groupDiceNumbers[1] == 2)) { // TODO finish
                System.out.println("Dwie pary");
                powerOfScore = 2;
                return;
            } else if (groupDiceNumbers[i] == 2) { // TODO finish
                System.out.println("Para z " + i);
                powerOfScore = 1;
                return;
            }
        }
    }
}
