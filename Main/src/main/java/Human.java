
import java.util.ArrayList;

public class Human{

    private String nameWizard = "Wizard";
    private String nameWarrior = "Warrior";
    private String nameArcher = "Crossbowman";
    private String nameRace = "Human";

    public Person humanWizard(String name, Object action1, Object action2){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(action1);
        list.add(action2);
        Wizard wizard = new Wizard(nameWizard + name, list);
        wizard.setRace(nameRace);
        return wizard;
    }

    public Person humanWarrior(String name, Object action){
        ArrayList <Object> list = new ArrayList<Object>();
        list.add(action);
        Warrior warrior = new Warrior(nameWarrior + name, list);
        warrior.setRace(nameRace);
        return warrior;
    }

    public Person humanArcher(String name, Object action1, Object action2){
        ArrayList <Object> list = new ArrayList<Object>();
        list.add(action1);
        list.add(action2);
        Archer archer = new Archer(nameArcher + name, list);
        archer.setRace(nameRace);
        return archer;
    }
}
