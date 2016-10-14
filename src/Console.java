class Console {
    static void displayDicesResult(Player p, ScoreChecker s) {
        for (int i = 0; i < 5; i++) {
            System.out.print(p.getDices(i) + ", ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(s.getgroupByDicesNumbers(i) + ", ");
        }
    }
}
