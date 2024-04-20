package umbcs680.hw11.carcomparator;
import java.util.Comparator;
import java.util.Objects;


public class ParetoComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2){
        return car1.getDominationCount() - car2.getDominationCount();
    }
}