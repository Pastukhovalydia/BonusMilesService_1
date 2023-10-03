public class BonusMilesService {
    public int calculate(int ticketPrice) {

        int milesPer20Rubles = 1; // Количество миль за каждые 20 рублей
        int milesEarned = ticketPrice / 20 * milesPer20Rubles;
        return milesEarned;

    }

}
