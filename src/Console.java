class Console {
    static void displayDicesResults(Dices p, ScoreChecker s) {
        for (int i = 0; i < 5; i++) {
            System.out.print(p.getDices()[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(s.getgroupByDicesNumbers()[i] + ", ");
        }
        System.out.println();
    }

    static void displayDrawn() {
        System.out.println("remis");
    }
    static void displayPlayerWin() {
        System.out.println("Pierwszy gracz wygral");
    }

    static void askForName(String player) {
        System.out.print(player +  " gracz, podaj imie: ");
    }
}
