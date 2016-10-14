class Player {

    private int[] playersDices = new int[5];

    void randomDices() {
        for (int i = 0; i < 5; i++) {
            playersDices[i] = (int) Math.floor(Math.random() * 5);
        }
    }

    int getDices(int index) {
        return playersDices[index];
    }
}
