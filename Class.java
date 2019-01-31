
package c.o.a.s.t;

/**
 *
 * @author Kevin Navarro
 */
public abstract class Class extends Character{
    private String className = null;
    
    protected Class(){
    }
    
    public Class(String characterName, int level, String raceName, String className){
        super(characterName, level, raceName, className);
    }
}
