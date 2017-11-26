
import java.util.ArrayList;

public class Undead{

    private String nameWizard = "Necromancer";
    private String nameWarrior = "Zombie";
    private String nameArcher = "Hunter";
    private String nameRace = "Undead";

    public Person undeadWizard(String name, Object action1, Object action2){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(action1);
        list.add(action2);
        Wizard wizard = new Wizard(nameWizard + name, list);
        wizard.setRace(nameRace);
        return wizard;
    }

    public Person undeadWarrior(String name, Object action){
        ArrayList <Object> list = new ArrayList<Object>();
        list.add(action);
        Warrior warrior = new Warrior(nameWarrior + name, list);
        warrior.setRace(nameRace);
        return warrior;
    }

    public Person undeadArcher(String name, Object action1, Object action2){
        ArrayList <Object> list = new ArrayList<Object>();
        list.add(action1);
        list.add(action2);
        Archer archer = new Archer(nameArcher + name, list);
        archer.setRace(nameRace);
        return archer;
    }
}
