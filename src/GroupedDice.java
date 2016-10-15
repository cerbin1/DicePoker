class GroupedDice {
    private final int[] diceNumbers;

    GroupedDice(int[] diceNumbers) {
        this.diceNumbers = diceNumbers;
    }

    int checkScore() {
        for (int i = 0; i <= 5; i++) {
            if (diceNumbers[i] == 5) {
                System.out.println("Poker z " + i);
                return 8;
            }
            if (diceNumbers[i] == 4) {
                System.out.println("Kareta z " + i);
                return 7;
            }//to jest widoczne w
            if (checkIfFull()) {
                System.out.println("Full");
                return 6;
            }
            if (isBigStreet()) {
                System.out.println("Duzy street");
                return 5;
            }
            if (isSmallStreet()) {
                System.out.println("Maly street");
                return 4;
            }
            if (diceNumbers[i] == 3) {
                System.out.println("Trojka z " + i);
                return 3;
            }
            if ((diceNumbers[0] == 2) && (diceNumbers[1] == 2)) { // TODO finish
                System.out.println("Dwie pary");
                return 2;
            }
            if (diceNumbers[i] == 2) { // TODO finish
                System.out.println("Para z " + i);
                return 1;
            }
        }
        return 0;
    }

    private boolean checkIfFull() { // TODO to do wyjebania, zrobić lepsza metode
        return ((diceNumbers[0] == 3) && (diceNumbers[1] == 2) || (diceNumbers[0] == 3) && (diceNumbers[2] == 2) || (diceNumbers[0] == 3) && (diceNumbers[3] == 2) ||
                (diceNumbers[0] == 3) && (diceNumbers[4] == 2) || (diceNumbers[0] == 3) && (diceNumbers[5] == 2) || (diceNumbers[1] == 3) && (diceNumbers[0] == 2) ||
                (diceNumbers[1] == 3) && (diceNumbers[2] == 2) || (diceNumbers[1] == 3) && (diceNumbers[3] == 2) || (diceNumbers[1] == 3) && (diceNumbers[4] == 2) ||
                (diceNumbers[1] == 3) && (diceNumbers[5] == 2) || (diceNumbers[2] == 3) && (diceNumbers[0] == 2) || (diceNumbers[2] == 3) && (diceNumbers[1] == 2) ||
                (diceNumbers[2] == 3) && (diceNumbers[3] == 2) || (diceNumbers[2] == 3) && (diceNumbers[4] == 2) || (diceNumbers[2] == 3) && (diceNumbers[5] == 2) ||
                (diceNumbers[3] == 3) && (diceNumbers[0] == 2) || (diceNumbers[3] == 3) && (diceNumbers[1] == 2) || (diceNumbers[3] == 3) && (diceNumbers[2] == 2) ||
                (diceNumbers[3] == 3) && (diceNumbers[4] == 2) || (diceNumbers[3] == 3) && (diceNumbers[5] == 2) || (diceNumbers[4] == 3) && (diceNumbers[0] == 2) ||
                (diceNumbers[4] == 3) && (diceNumbers[1] == 2) || (diceNumbers[4] == 3) && (diceNumbers[2] == 2) || (diceNumbers[4] == 3) && (diceNumbers[3] == 2) ||
                (diceNumbers[4] == 3) && (diceNumbers[5] == 2) || (diceNumbers[5] == 3) && (diceNumbers[0] == 2) || (diceNumbers[5] == 3) && (diceNumbers[1] == 2) ||
                (diceNumbers[5] == 3) && (diceNumbers[2] == 2) || (diceNumbers[5] == 3) && (diceNumbers[3] == 2) || (diceNumbers[5] == 3) && (diceNumbers[4] == 2)
        );
    }

    private boolean isBigStreet() {
        return (diceNumbers[1] == 1) && (diceNumbers[2] == 1) && (diceNumbers[3] == 1) && (diceNumbers[4] == 1) && (diceNumbers[5] == 1);
    }

    private boolean isSmallStreet() {
        return (diceNumbers[0] == 1) && (diceNumbers[1] == 1) && (diceNumbers[2] == 1) && (diceNumbers[3] == 1) && (diceNumbers[4] == 1);
    }
}
