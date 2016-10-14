class ScoreChecker {
    byte[] groupByDicesNumbers = {0, 0, 0, 0, 0};

    void checkPairs(Player player) {
        for (byte i = 0; i < 5; i++) {
            if(player.getDices(i) == i) {
                groupByDicesNumbers[i] = i;
            }
        }

    }
}
