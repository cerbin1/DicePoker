class ScoreChecker {
    private int[] groupDiceNumbers = {0, 0, 0, 0, 0};

    void groupDicesNumbers(Player player) {
        for (int i = 0; i < 5; i++) {
            groupDiceNumbers[player.getDices()[i]]++;
        }
    }

    int[] getgroupByDicesNumbers() {
        return groupDiceNumbers;
    }


    void checkPoker() {
        if (groupDiceNumbers[0] == 5) {
            System.out.println("Poker z 0");
        }
        else if (groupDiceNumbers[1] == 5) {
            System.out.println("Poker z 0");
        }
        else if (groupDiceNumbers[2] == 5) {
            System.out.println("Poker z 0");
        }
        else if (groupDiceNumbers[3] == 5) {
            System.out.println("Poker z 0");
        }
        else if (groupDiceNumbers[4] == 5) {
            System.out.println("Poker z 0");
        }
    }
}
