
package c.o.a.s.t;

/**
 *
 * @author Kevin Navarro
 */
public class Option {
    boolean used = false;
    
    
    protected Option(){
    }
    
    public void useOption(){
        used = true;
    }
    
    public void resetTurn(){
        used = false;
    }
    
    
}
