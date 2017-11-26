
import java.util.ArrayList;

public class Orc{

    private String nameWizard = "Voodoo";
    private String nameWarrior = "Goblin";
    private String nameArcher = "Archer";
    private String nameRace = "Orc";

    public Person orcWizard(String name, Object action1, Object action2){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(action1);
        list.add(action2);
        Wizard wizard = new Wizard(nameWizard + name, list);
        wizard.setRace(nameRace);
        return wizard;
    }

    public Person orcWarrior(String name, Object action){
        ArrayList <Object> list = new ArrayList<Object>();
        list.add(action);
        Warrior warrior = new Warrior(nameWarrior + name, list);
        warrior.setRace(nameRace);
        return warrior;
    }

    public Person orcArcher(String name, Object action1, Object action2){
        ArrayList <Object> list = new ArrayList<Object>();
        list.add(action1);
        list.add(action2);
        Archer archer = new Archer(nameArcher + name, list);
        archer.setRace(nameRace);
        return archer;
    }
}
