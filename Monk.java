
package c.o.a.s.t;

/**
 *
 * @author Kevin Navarro
 */
public class Monk extends Class{
    private String className = "Monk";
    
    public Monk(){
    }
    
    public Monk(String characterName, int level, String raceName){
        super(characterName, level, raceName, "Monk");
    }
}
