import com.cgvsu.interpolation.RadialInterpolation;
import com.cgvsu.models.Point;
import javafx.scene.paint.Color;
import java.util.List;

public class Test {
    @org.junit.jupiter.api.Test
    public void TestInterpolation(){
        RadialInterpolation ri = new RadialInterpolation(100, 100, 2, Color.AQUA, Color.CRIMSON);
        if (!ri.getInterpolationPixel(102, 102).getC0().equals(Color.CRIMSON)){
            throw new RuntimeException();
        }
    }
}
