class Dices {

    private int[] playersDices = new int[5];
    private String playersName;

    void randomDices() {
        for (int i = 0; i < 5; i++) {
            playersDices[i] = (int) Math.floor(Math.random() * 5);
        }
    }

    int[] getDices() {
        return playersDices;
    }

    void setPlayersName(String playersName) {
        this.playersName = playersName;
    }

    String getPlayersName() {
        return playersName;
    }
}
