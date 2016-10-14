class Player {

    private int[] playersDices = new int[5];

    void randomDices() {
/*        for (int i = 0; i < 5; i++) {
            playersDices[i] = (int) Math.floor(Math.random() * 5);
        }*/
        playersDices[0] = 0;
        playersDices[1] = 0;
        playersDices[2] = 0;
        playersDices[3] = 1;
        playersDices[4] = 1;
    }

    int[] getDices() {
        return playersDices;
    }
}
