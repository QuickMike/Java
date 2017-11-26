
import java.util.ArrayList;

public class Archer extends Person implements Action {

    public Archer(String name, ArrayList<Object> list) {
        setName(name);
        setMotion(list);
    }

    @Override
    public boolean action(Person person, Object action, boolean enemy) {
        if (enemy){
            int dnorm = Integer.parseInt(action.toString());
            int dvip = 0;
            int dsick = 0;
            String st = " attack (" + dnorm;
            if (isVip()){
                dvip = (int) (dnorm / 2) + (dnorm % 2);
                st += "+" + dvip;
            }
            if (isSick()){
                dsick = (int) ((dnorm + dvip) / 2) + ((dnorm + dvip) % 2);
                st += "-" + dsick;
            }
            dnorm = dnorm + dvip - dsick;
            st += ") ";
            LogTextInFile.writeLog(st + person.sayAboutYourself(false) + " (" + person.getHealth() + "-" + dnorm + "=");
            person.lossHealth(dnorm);
            LogTextInFile.writeLog(person.getHealth() + ") ");
            if (!person.isLive()){
                LogTextInFile.writeLog("DIE...\n");
            }else {
                LogTextInFile.writeLog("\n");
            }
            return true;
        }
        return false;
    }
}
