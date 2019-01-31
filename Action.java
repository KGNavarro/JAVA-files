
package c.o.a.s.t;

/**
 *
 * @author Kevin Navarro
 */
public class Action extends Option {
    String actionName = null;
    String actionDescription = null;
    
    public Action(){
    }
    
    public Action(String actionName, String actionDescription){
        this.actionName = actionName;
        this.actionDescription = actionDescription;
    }
    
    protected void useAction(){
        
    }
    
    protected void initializeGameActions(){
        Option attack = new Action();
        Option castSpell = new Action();
        Option dash = new Action();
        Option disengage = new Action();
        Option dodge = new Action();
        Option help = new Action();
        Option hide = new Action();
        Option ready = new Action();
        Option search = new Action();
        Option object = new Action();
        Option improvise = new Action();
    }
    
}
