class Player {

    private int[] playersDices = new int[6];

    void randomDices() {
        for (int i = 0; i < 6; i++) {
            playersDices[i] = (int) Math.floor(Math.random() * 6);
        }
    }

    int getDices(int index) {
        return playersDices[index];
    }
}
