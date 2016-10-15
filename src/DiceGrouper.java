class DiceGrouper {

    GroupedDice groupDicesNumbers(Dices player) {
        int[] groupDiceNumbers = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 5; i++) {
            int[] diceNumbers = player.getDices();
            groupDiceNumbers[diceNumbers[i]]++;
        }
        return new GroupedDice(groupDiceNumbers);
    }
}

// Dupa dupa
