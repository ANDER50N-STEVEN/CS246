package anderson;

public class Lodging implements Expense{
    Destination place;
    int days;

    public Lodging(Destination place, int nights){
        this.place = place;
        days = nights;
    }

    @Override
    public float getCost() {

        switch (place){
            case Mexico:
                return 100.00f * days;
            case Europe:
                return (200.00f * days) * 1.10f;
            case Japan:
                return (300.00f * days) * 1.30f;
            default:
                return 0.0f;
        }
    }
}
