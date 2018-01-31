package anderson;

public class Dining implements Expense{
    Destination place;
    int days;

    public Dining(Destination place, int nights){
        this.place = place;
        days = nights;
    }

    @Override
    public float getCost() {
        switch (place){
            case Mexico:
                return 10.00f * days;
            case Europe:
                return 20.00f * days;
            case Japan:
                return 30.00f * days;
            default:
                return 0.0f;
        }
    }
}
