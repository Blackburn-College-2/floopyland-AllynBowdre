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
        super.color="https://cdn.friendlystock.com/wp-content/uploads/2018/10/friendlystock-super-nurse-1.jpg";
        super.name="healer1";
        super.type="HEALER";
        super.setMaxHp(1000);
        super.setMaxDamage(100);
    }
     
}
