package anderson;

import com.google.gson.annotations.SerializedName;

public class User {

    String name;
    @SerializedName("followers_count")
    int followers;

    String getName()  { return name;}
    void setName(String _name)   {name = _name; }
    int getFollowers()    {return followers;}
    void setFollowers(int _followers)   {followers = _followers;}

}
