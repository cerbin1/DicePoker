class ScoreChecker {
    private int[] groupByDicesNumbers = {0, 0, 0, 0, 0};

    void groupDicesNumbers(Player player) {
        for (int i = 0; i < 5; i++) {
            groupByDicesNumbers[player.getDices()[i]]++;
        }
    }

    int[] getgroupByDicesNumbers() {
        return groupByDicesNumbers;
    }
}
