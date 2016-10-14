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
        for (int i = 0; i < 5; i++) {
            if (groupDiceNumbers[i] == 5) {
                System.out.println("Poker z " + i);
            }
        }
    }
}
