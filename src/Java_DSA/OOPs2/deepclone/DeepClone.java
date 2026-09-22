package Java_DSA.OOPs2.deepclone;

import java.util.ArrayList;
import java.util.List;

public class DeepClone {

    List<Byte> encryptedData = new ArrayList<>();

    public void setEncryptedData(List<Byte> encryptedData) {
        this.encryptedData = encryptedData;
    }

    static void main() {

        DeepClone dc = new DeepClone();
        dc.encryptedData.add((byte) 10);

        // WHY I can't do encryptedDate.add() and such?
        Game original = new Game(10802, "Red Dead Redemption 2", new ArrayList<Byte>());
        Game clone = new Game(original);

        System.out.println("Original: " + original.gameName);
        System.out.println("Clone: " + clone.gameName);
    }


}

class Game {
    int gameId;
    String gameName;
    List<Byte> gameData;

    public Game(int gameId, String gameName, List<Byte> gameData) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameData = gameData;
    }

    public Game(Game copy){
        this.gameId = copy.gameId;
        this.gameName = copy.gameName;

        //Deep clone
        if (copy.gameData != null){
            this.gameData = new ArrayList<>(copy.gameData);
        }
    }
}