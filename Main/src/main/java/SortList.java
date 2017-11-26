
import java.util.ArrayList;

public class SortList {

    public static boolean listDelDIE(ArrayList<Person> list){
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isLive()){
                list.remove(i);
                flag = true;
                i--;
            }
        }
        return flag;
    }

    public static void listClearBAN(ArrayList<Person> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isBan()){
                list.get(i).setBan(false);
                LogTextInFile.writeLog(list.get(i).sayAboutYourself(false) + " Not BAN, ");
                list.get(i).setVip(true);
                LogTextInFile.writeLog(list.get(i).sayAboutYourself(true) + "\n");
            }
        }
    }
}
