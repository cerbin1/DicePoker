public class ScoreChecker {
    int pairs;

    void checkPairs(Player player) {
        if(((player.getDices(0) == 0) && player.getDices(1) == 0)) {
            System.out.println("Mamy pare");
        }
        if(((player.getDices(1) == 0) && player.getDices(2) == 0)) {
            System.out.println("Mamy pare");
        }
        if(((player.getDices(2) == 0) && player.getDices(3) == 0)) {
            System.out.println("Mamy pare");
        }
        if(((player.getDices(3) == 0) && player.getDices(4) == 0)) {
            System.out.println("Mamy pare");
        }
    }
}
