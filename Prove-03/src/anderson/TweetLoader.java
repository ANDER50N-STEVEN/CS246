package anderson;

import com.google.gson.Gson;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.*;

public class TweetLoader {

    Twitter twitter;

    public TweetLoader() {
        configureKeys();
    }

    private void configureKeys() {

        ConfigurationBuilder cb = new ConfigurationBuilder();

// This continuous set of function calls all connected together is referred to
// as "method chaining". It is a popular technique amongst web developers and has
// gradually found its way into other languages.
//
// The way it works is that each setter returns a reference to the object.
// For example, the code in the setDebugEnabled function might look like this:
//
//  ConfigurationBuilder setDebugEnabled(Boolean value) {
//      this.debugEnabled = value;
//
//      // Returning "this" allows method chaining.
//      return this;
//  }
//
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("xxxxxx")
                .setOAuthConsumerSecret("xxxxxxxxxxxxxxxx")
                .setOAuthAccessToken("xxxxxxxxxxxxxxxxxxxxxxxxxx")
                .setOAuthAccessTokenSecret("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .setJSONStoreEnabled(true);

        TwitterFactory tf = new TwitterFactory(cb.build());
        this.twitter = tf.getInstance();

    }

    public Map<String, BYUITweet>retrieveTweetsWithHashTag(String hashtag){
        Gson gson = new Gson();
        Map<String, BYUITweet> tweeter = new TreeMap<>();

        List<Status> tweets = new ArrayList<>();
        Query query = new Query(hashtag);
        QueryResult result;
        try {
            result = twitter.search(query);
            tweets = result.getTweets();
        }
        catch(TwitterException e) {
            e.printStackTrace();
        }
        for (Status status : tweets) {
            String statusInJson = TwitterObjectFactory.getRawJSON(status);

            BYUITweet Beet = gson.fromJson(statusInJson, BYUITweet.class);

            tweeter.put(Beet.getUser().getName(), Beet);
        }


        return tweeter;


    }
}
