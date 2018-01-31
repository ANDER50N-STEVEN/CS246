package anderson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> newString = new ArrayList<String>();
        newString.add("Bob");
        newString.add("Jane");
        newString.add("Mary");
        newString.add("Mike");
        newString.add("Phil");
        newString.add("Pam");

        Collections.sort(newString);

        for (String word: newString)
        System.out.println(word);


    }
}
