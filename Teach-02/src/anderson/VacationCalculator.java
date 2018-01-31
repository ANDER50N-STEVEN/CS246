package anderson;

import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {

    public static void main(String[] args) {
	// write your code here

        VacationCalculator vc = new VacationCalculator();

        float japanCost = vc.calculateVacationCost (Destination.Japan, 5);
        float europeCost = vc.calculateVacationCost (Destination.Europe, 5);
        float mexicoCost = vc.calculateVacationCost (Destination.Mexico, 5);

        System.out.println(String.format("The Cost of vacationing in Japan is $%.2f%n", japanCost));
        System.out.println(String.format("The Cost of vacationing in Europe is $%.2f%n", europeCost));
        System.out.println(String.format("The Cost of vacationing in Mexico is $%.2f%n", mexicoCost));

    }

    public float calculateVacationCost(Destination place, int days) {

        List<Expense> itenerary = new ArrayList<Expense>();
        itenerary.add(new Cruise(place));
        itenerary.add(new Dining(place, days));
        itenerary.add(new Lodging(place, days));


        float totalCost = tallyExpenses(itenerary);
        return totalCost;
    }

    private float tallyExpenses(List<Expense> expenses){
        float totalCost = 0;

        for(Expense e : expenses){
            totalCost += e.getCost();
        }
        return totalCost;
    }
}
