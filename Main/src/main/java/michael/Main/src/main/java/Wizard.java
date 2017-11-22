

import java.util.ArrayList;

public class Wizard extends Person implements Action{

    public Wizard(String name, ArrayList<Object> list) {
        setName(name);
        setMotion(list);
    }

    @Override
    public boolean action(Person person, Object action, boolean enemy) {
        String st = "";
        if (action.equals(Message.MAGIC_ACTION_VIP) && !enemy){
            st = " add VIP for: ";
            LogTextInFile.writeLog(st);
            person.setVip(true);
            LogTextInFile.writeLog(person.sayAboutYourself(true) + "\n");
            return true;
        }
        if (action.equals(Message.MAGIC_ACTION_BAN) && enemy) {
            st = " take off VIP for: ";
            LogTextInFile.writeLog(st);
            person.setBan(true);
            LogTextInFile.writeLog(person.sayAboutYourself(true) + "\n");
            return true;
        }
        if (action.equals(Message.MAGIC_ACTION_SICK) && enemy) {
            st = " add SICK for: ";
            LogTextInFile.writeLog(st);
            person.setSick(true);
            LogTextInFile.writeLog(person.sayAboutYourself(true) + "\n");
            return true;
        }
        if (action instanceof java.lang.Integer){
            int dnorm = Integer.parseInt(action.toString());
            int dvip = 0;
            int dsick = 0;
            st = " attack (" + dnorm;
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

