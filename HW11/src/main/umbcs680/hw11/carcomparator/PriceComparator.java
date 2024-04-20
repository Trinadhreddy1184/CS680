package umbcs680.hw11.carcomparator;
import java.util.Comparator;
import java.util.Objects;


public class PriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2){
        return (int) (car1.getPrice() - car2.getPrice());
    }

    
}