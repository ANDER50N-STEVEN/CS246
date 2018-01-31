package anderson;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TweetLoader load = new TweetLoader();


        System.out.println("What would you like to search for?");

        Scanner reader = new Scanner(System.in);
        String input = reader.next();
//        Map<String, BYUITweet> map = new HashMap<>();


        for (Map.Entry<String, BYUITweet> entry : load.retrieveTweetsWithHashTag(input).entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue().getUser().getFollowers();
            String text = entry.getValue().getText();


//            Collections.sort(value, map);
//            Collections.sort(value new Comparator<String>())


            System.out.println(key + "(" + value + " followers) - " + text);

        }
    }
}
