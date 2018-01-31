package anderson;

public class Cruise implements Expense {

    Destination place;

    public Cruise (Destination place){
        this.place = place;
    }

    public float getCost() {
        switch (place){
        case Japan:
            return 3000.00f;
        case Europe:
            return 2000.00f;
        case Mexico:
            return 1000.00f;
        default:
            return 0f;
        }
    }
}
