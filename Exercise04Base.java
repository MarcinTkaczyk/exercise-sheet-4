import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import java.io.PrintStream;
import javafx.application.Platform;
import java.io.*;

/**
 * Abstrakte Klasse Exercise03Base - beschreiben Sie hier die Klasse
 * 
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public abstract class Exercise04Base extends SimpleHamsterGame
{
    protected Territory territory;
    protected PrintStream output = System.out;

    Exercise04Base() {
        
        File terFile = new File ("+libs/territories/territory-ub04.ter");
            try(
            InputStream targetStream = new FileInputStream(terFile);
            ) {
            game.initialize(targetStream);
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        this.territory = this.game.getTerritory();
    }

}
