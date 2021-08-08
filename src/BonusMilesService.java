public class BonusMilesService {
    public int calculate(int price) {
        // int price;
        int bonusLimit;
        int miles;
        // price = 10_000;
        bonusLimit = 20;
        miles = price / bonusLimit;
             return miles;
    }
}
