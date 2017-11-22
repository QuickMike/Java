
import java.util.ArrayList;

public class UndeadTeam {

    public ArrayList<Person> UndeadTeam() {
        ArrayList<Person> list = new ArrayList<Person>();
        Undead undead = new Undead();
        list.add(undead.undeadWizard("", Message.MAGIC_ACTION_SICK, 5));
        for (int i = 1; i < 5; i++) {
            list.add(undead.undeadWarrior(Message.SYMBOL + i, 18));
            if (i<4){
                list.add(undead.undeadArcher(Message.SYMBOL + i, 4, 2));
            }
        }
        return list;
    }
}
