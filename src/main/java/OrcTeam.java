
import java.util.ArrayList;

public class OrcTeam {

    public ArrayList<Person> OrcTeam() {
        ArrayList<Person> list = new ArrayList<Person>();
        Orc orc = new Orc();
        list.add(orc.orcWizard("", Message.MAGIC_ACTION_VIP, Message.MAGIC_ACTION_BAN));
        for (int i = 1; i < 5; i++) {
            list.add(orc.orcWarrior(Message.SYMBOL + i, 20));
            if (i<4){
                list.add(orc.orcArcher(Message.SYMBOL + i, 3, 2));
            }
        }
        return list;
    }
}
