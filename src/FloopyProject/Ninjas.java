package FloopyProject;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 *
 * @author allyn
 */
public class Ninjas extends ConcreteHero{
    
    public Ninjas(GameBoard g, Point p) {
        super(g, p);
        super.color="red";
        super.name="hero1";
        super.type="NINJA";
        super.setMaxHp(1200);
        super.setMaxDamage(100);
    }
    
}
