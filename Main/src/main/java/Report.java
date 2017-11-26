
import java.util.ArrayList;

public class Report {

    private static int maxLength = 0;

    public static void setMaxLength(ArrayList<Person> list1, ArrayList<Person> list2, int maxTab) {
        Report.maxLength = maxLengthName(list1) + maxLengthName(list2) + maxTab;
    }

    public static String infoTeamVS(ArrayList<Person> list1, ArrayList<Person> list2){
        String st = "";
        if (list1.size() >= list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                st += list1.get(i).sayAboutYourself(true);
                if (list2.size() > i){
                    int currentLength = maxLength - list1.get(i).sayAboutYourself(true).length() -
                            list2.get(i).sayAboutYourself(true).length();
                    for (int j = 0; j < currentLength; j++) {
                        st += " ";
                    }
                    st += list2.get(i).sayAboutYourself(true);
                }
                st += "\n";
            }
        }else {
            for (int i = 0; i < list2.size(); i++) {
                int lengthName1 = 0;
                if (list1.size() > i) {
                    st += list1.get(i).sayAboutYourself(true);
                    lengthName1 = list1.get(i).sayAboutYourself(true).length();
                }
                for (int j = 0; j < (maxLength - lengthName1 -
                        list2.get(i).sayAboutYourself(true).length()); j++) {
                   st += " ";
                }
                st += list2.get(i).sayAboutYourself(true);
                st += "\n";
            }
        }
        return st;
    }

    public static int maxLengthName(ArrayList<Person> list){
        int rezult = 0;
        if (list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).sayAboutYourself(true).length() > rezult){
                    rezult = list.get(i).sayAboutYourself(true).length();
                }
            }
        }
        return rezult;
    }
}
