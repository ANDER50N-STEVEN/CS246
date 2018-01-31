package anderson;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Gson g = new Gson();
        Player Player1 = new Player(15, 75, 50);
        Game newGame = new Game(Player1);
        newGame.saveGame();
        Game secondGame = new Game();
        secondGame.loadGame();


        Player1.addEquipment("Sword", 10);

        Player1.display();
        newGame.saveGame();
    }
}
