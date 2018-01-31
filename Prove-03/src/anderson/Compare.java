package anderson;

import java.util.Comparator;

public class Compare implements Comparator<String> {


    @Override
    public int compare(String left, String right) {
        int returnValue = 0;

        if (left.length() < right.length())
          returnValue = -1;
        else if(left.length() > right.length())
            returnValue = 1;

        return returnValue;
    }
}
