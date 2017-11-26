
import java.util.ArrayList;

public class MRandom {

    public static boolean coinFlip(){
        int maxTry = 10000;
        int sumTry = 0;
        for (int i = 0; i < maxTry; i++) {
            sumTry += 1 + (Math.random() * maxTry);
        }
        sumTry = sumTry / maxTry;
        return sumTry >= maxTry / 2;
    }

    public static int getRandomX(int minNumber, int maxNumber){
        maxNumber -= minNumber;
        return (int) (minNumber + (Math.random() * ++maxNumber));
    }

    public static Person randomPerson(ArrayList<Person> list, int messageFlag) {
        ArrayList<Person> vip = new ArrayList<Person>();
        Person person = null;
        if (messageFlag != Message.SELECT_FROM_ALL){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isVip()){
                    vip.add(list.get(i));
                    list.remove(i);
                    i--;
                }
            }
        }
        if (messageFlag == Message.SELECT_FROM_ALL_FERST_VIP && (vip.size() > 0)){
            person = vip.get(MRandom.getRandomX(0, vip.size() - 1));
        }else {
            if (list.size() > 0){
                person = list.get(MRandom.getRandomX(0, list.size() - 1));
            }
        }
        for (int i = 0; i < vip.size(); i++) {
            list.add(vip.get(i));
            vip.remove(i);
            i--;
        }
        return person;
    }
}
