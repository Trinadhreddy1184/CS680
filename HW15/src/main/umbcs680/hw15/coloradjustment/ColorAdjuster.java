package umbcs680.hw15.coloradjustment;

import java.util.ArrayList;
import java.util.Objects;

@FunctionalInterface
public interface ColorAdjuster {
    public umbcs680.hw15.coloradjustment.Color adjust(umbcs680.hw15.coloradjustment.Color color);
}