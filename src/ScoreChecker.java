class ScoreChecker {
    int pairs;
    boolean[] pairChecker = {true, true, true, true, true};

    void checkPairs(Player player) {
        if(((player.getDices(0) == 0) && player.getDices(1) == 0) && (pairChecker[0]) && pairChecker[1]) {
            System.out.println("Mamy pare indeksy 0 i 1");
            pairChecker[0] = false;
            pairChecker[1] = false;
        }
        if(((player.getDices(1) == 0) && player.getDices(2) == 0) && (pairChecker[1]) && pairChecker[2]) {
            System.out.println("Mamy pare indeksy 1 i 2");
            pairChecker[1] = false;
            pairChecker[2] = false;
        }
        if(((player.getDices(2) == 0) && player.getDices(3) == 0) && (pairChecker[2]) && pairChecker[3]) {
            System.out.println("Mamy pare indeksy 2 i 3");
            pairChecker[2] = false;
            pairChecker[3] = false;
        }
        if(((player.getDices(3) == 0) && player.getDices(4) == 0) && (pairChecker[3]) && pairChecker[4]) {
            System.out.println("Mamy pare indeksy 3 i 4");
            pairChecker[3] = false;
            pairChecker[4] = false;
        }

    }
}
