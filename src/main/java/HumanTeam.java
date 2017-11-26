
import java.util.ArrayList;

public class HumanTeam {

    public ArrayList<Person> HumanTeam() {
        ArrayList<Person> list = new ArrayList<Person>();
        Human human = new Human();
        list.add(human.humanWizard("", Message.MAGIC_ACTION_VIP, 4));
        for (int i = 1; i < 5; i++) {
            list.add(human.humanWarrior(Message.SYMBOL + i, 18));
            if (i<4){
                list.add(human.humanArcher(Message.SYMBOL + i, 5, 3));
            }
        }
        return list;
    }
}
