class Dices {

    private int[] playersDices = new int[5];
    private String playersName;

    void randomDices() {
        for (int i = 0; i < 5; i++) {
            playersDices[i] = (int) (Math.floor(Math.random() * 5) + 1); // TODO prawa strona równasię powinna isc do innej metody
        }
    }

    int[] getDices() {
        return playersDices;
    }

    void setPlayersName(String playersName) { // TODO ta metoda nie powinna być tu
        this.playersName = playersName;
    }

    String getPlayersName() { // TODO to też nie
        return playersName;
    }
}
