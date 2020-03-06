package FloopyProject;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 *
 * @author allyn
 */
public class Tankers extends ConcreteHero{
    
    public Tankers(GameBoard g, Point p) {
        super(g, p);
        super.color="red";
        super.name="hero1";
        super.type="TANKER";
        super.setMaxHp(1500);
        super.setMaxDamage(100);
    }
    
}
