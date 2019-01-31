
package c.o.a.s.t;

/**
 *
 * @author Kevin Navarro
 */
public abstract class Character{
    String characterName = null;
    String age = null;
    String alignment = null;
    int level = 1;
    String size = null;
    String height = null;
    String weight = null;
    String className = null;
    String raceName = null;
    String subClassName = null;
    
    public Character(){
    }
    
    public Character(String characterName, int level, String raceName, String className){
        this.characterName = characterName;
        this.level = level;
        this.raceName = raceName;
        this.className = className;
    }
    
    public String toString(){
        if(this.level > 2)
        return characterName + ". A level " + level + ", " + raceName + ", " + subClassName + " " + className +".";
        else
            return characterName + ". A level " + level + ", " + raceName + ", " + className +".";
    }
    
    public void changeLevel(int lvl){
        this.level = lvl;
    }
}
