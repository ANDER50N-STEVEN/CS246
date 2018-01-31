package anderson;

public class WeakPasswordException extends Exception{

    public WeakPasswordException(){
        super("Your password is too weak, it must be at least " +
                "8 characters long and have at least one number");
    }

}