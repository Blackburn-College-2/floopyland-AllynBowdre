package FloopyProject;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;


/**
 *
 * @author allyn
 */
public class Healers extends ConcreteHero{
     
    public Healers(GameBoard g, Point p) {
        super(g, p);
        super.color="red";
        super.name="healer1";
        super.type="HEALER";
        super.setMaxHp(1000);
        super.setMaxDamage(100);
    }
     
}
