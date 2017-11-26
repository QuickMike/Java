
import java.util.ArrayList;

public class ElfTeam {

    public ArrayList<Person> ElfTeam() {
        ArrayList<Person> list = new ArrayList<Person>();
        Elf elf = new Elf();
        list.add(elf.elfWizard("", Message.MAGIC_ACTION_VIP, 10));
        for (int i = 1; i < 5; i++) {
            list.add(elf.elfWarrior(Message.SYMBOL + i, 15));
            if (i<4){
                list.add(elf.elfArcher(Message.SYMBOL + i, 7, 3));
            }
        }
        return list;
    }
}
