class ScoreChecker {
    private int[] groupDiceNumbers = {0, 0, 0, 0, 0, 0};
    private int powerOfScore = 0;

    void groupDicesNumbers(Dices player) {
        for (int i = 0; i < 5; i++) {
            int[] diceNumbers = player.getDices();
            groupDiceNumbers[diceNumbers[i]]++;
        }
    }

    int getPowerOfScore() {
        return powerOfScore;
    }

    private boolean checkIfFull() {
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

    void checkScore() {
        for (int i = 0; i <= 5; i++) {
            if (groupDiceNumbers[i] == 5) {
                System.out.println("Poker z " + i);
                powerOfScore = 8;
                return;
            } else if (groupDiceNumbers[i] == 4) {
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
