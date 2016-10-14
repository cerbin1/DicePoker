class Console {
    static void displayDicesResult(Player p) {
        for (int i = 0; i < 5; i++) {
            System.out.println(p.getDices(i));
        }
    }
}
