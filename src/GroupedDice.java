class GroupedDice {
    private int[] groupDiceNumbers;

    GroupedDice(int[] groupDiceNumbers) {
        this.groupDiceNumbers = groupDiceNumbers;
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

    int checkScore() {
        for (int i = 0; i <= 5; i++) {
            if (groupDiceNumbers[i] == 5) {
                System.out.println("Poker z " + i);
                return 8;
            }
            if (groupDiceNumbers[i] == 4) {
                System.out.println("Kareta z " + i);
                return 7;
            }
            if (checkIfFull()) {
                System.out.println("Full");
                return 6;
            }
            if ((groupDiceNumbers[0] == 1) && (groupDiceNumbers[1] == 1) && (groupDiceNumbers[2] == 1) && (groupDiceNumbers[3] == 1) && (groupDiceNumbers[4] == 1)) {
                System.out.println("Maly street");
                return 5;
            }
            if ((groupDiceNumbers[1] == 1) && (groupDiceNumbers[2] == 1) && (groupDiceNumbers[3] == 1) && (groupDiceNumbers[4] == 1) && (groupDiceNumbers[5] == 1)) {
                System.out.println("Duzy street");
                return 4;
            }
            if (groupDiceNumbers[i] == 3) {
                System.out.println("Trojka z " + i);
                return 3;
            }
            if ((groupDiceNumbers[0] == 2) && (groupDiceNumbers[1] == 2)) { // TODO finish
                System.out.println("Dwie pary");
                return 2;
            }
            if (groupDiceNumbers[i] == 2) { // TODO finish
                System.out.println("Para z " + i);
                return 1;
            }
        }
        return 0;
    }
}
