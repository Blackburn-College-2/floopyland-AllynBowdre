package FloopyProject;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 *
 * @author allyn
 */
public class Thieves extends ConcreteHero {
    
    public Thieves(GameBoard g, Point p) {
        super(g, p);
        super.color="red";
        super.name="hero1";
        super.type="THEIF";
        super.setMaxHp(1000);
        super.setMaxDamage(100);
    }
    
}
