package anderson;

import com.google.gson.Gson;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Game {

    Player newPlayer;

    public Game(){

    }

    public Game(Player _newPlayer) {
        newPlayer = _newPlayer;
    }

    public Player getPlayer() {
        return newPlayer;
    }

    public void saveGame()throws Exception{
        Gson gson = new Gson();

        String text = gson.toJson(newPlayer);
        try {
            FileWriter fileWriter = new FileWriter("Save.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);
            printWriter.close();

        }
        catch (Exception e)
        {
            System.out.println("Could not save game");
        }
                System.out.println(text);
                return;

    }
    public static Game loadGame() throws Exception{

        String content = new String (Files.readAllBytes(Paths.get("Save.txt")));
        if ( content == null)
           throw new Exception("File not found");
        System.out.println(content);
        String text = content;
        Gson gson = new Gson();
        Player savedPlayer = gson.fromJson(text, Player.class);

        Game newGame = new Game(savedPlayer);

        return newGame;

    }

}
