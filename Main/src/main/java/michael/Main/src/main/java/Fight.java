
import java.util.ArrayList;

public class Fight {
    private static int turn = 1;

    public static void startFight(ArrayList<Person> listA, ArrayList<Person> listB){
        if (MRandom.coinFlip()){
            LogTextInFile.writeLog("Turn " + turn + ": ");
            turnPerson(listB, listA);
            turn++;
        }
        while (true){
            LogTextInFile.writeLog("Turn " + turn + ": ");
            turnPerson(listA, listB);
            SortList.listClearBAN(listA);
            if (SortList.listDelDIE(listB)){
                LogTextInFile.writeLog("\n" + Report.infoTeamVS(listA, listB) + "\n");
            }
            if (listB.isEmpty()){
                LogTextInFile.writeLog("Game ower");
                return;
            }
            turn++;
            LogTextInFile.writeLog("Turn " + turn + ": ");
            turnPerson(listB, listA);
            SortList.listClearBAN(listB);
            if (SortList.listDelDIE(listA)){
                LogTextInFile.writeLog("\n" + Report.infoTeamVS(listA, listB) + "\n");
            }
            if (listA.isEmpty()){
                LogTextInFile.writeLog("Game ower");
                return;
            }
            turn++;
        }
    }

    private static void turnPerson(ArrayList<Person> list1, ArrayList<Person> list2){
        Person person1;
        Person person2;
        Object action;
        person1 = MRandom.randomPerson(list1, Message.SELECT_FROM_ALL_FERST_VIP);
        LogTextInFile.writeLog(person1.sayAboutYourself(true));
        boolean actionCanDo = false;
        do {
            action = person1.getRandomMotion();
            if (action instanceof java.lang.String){
                if (list1.size() > 1){
                    do {
                        person2 = MRandom.randomPerson(list1, Message.SELECT_FROM_ALL);
                    }while (person1.equals(person2));
                    actionCanDo = person1.action(person2, action, false);
                    if (!actionCanDo){
                        person2 = MRandom.randomPerson(list2, Message.SELECT_FROM_ALL);
                        actionCanDo = person1.action(person2, action, true);
                    }
                }
                else {
                    person2 = MRandom.randomPerson(list2, Message.SELECT_FROM_ALL);
                    actionCanDo = person1.action(person2, action, true);
                }
            }else {
                person2 = MRandom.randomPerson(list2, Message.SELECT_FROM_ALL);
                actionCanDo = person1.action(person2, action, true);
            }
        }while (!actionCanDo);

        if (person1.isVip()){
            person1.setVip(false);
            LogTextInFile.writeLog(person1.sayAboutYourself(false) + " not VIP\n");
        }
        if (person1.isSick()){
            person1.setSick(false);
            LogTextInFile.writeLog(person1.sayAboutYourself(false) + " not SICK\n");
        }
    }
}
