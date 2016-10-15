class Dices {

    private int[] playersDices = new int[5];
    private String playersName;

    private int randomNumber() {
        return (int) (Math.floor(Math.random() * 5) + 1);
    }

    void randomDices() {
        for (int i = 0; i < 5; i++) {
            playersDices[i] = randomNumber();
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
