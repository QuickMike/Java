
import java.util.ArrayList;

public abstract class Person implements Action{

    private int health = 100;
    private String race;
    private boolean vip = false;
    private boolean sick = false;
    private boolean ban = false;
    private String name;
    private ArrayList<Object> motion = new ArrayList<Object>();

    Person(){
        if (MRandom.coinFlip()){
            setVip(true);
        }
    }

    public int getHealth() {
        return health;
    }

    public String getRace() {
        return race;
    }

    public boolean isVip() {
        return vip;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Object> getMotion() {
        return motion;
    }

    public Object getRandomMotion(){
        int maxMotion = getMotion().size();
        int returnMoion =  MRandom.getRandomX(0, --maxMotion);
        return getMotion().get(returnMoion);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public void setMotion(ArrayList<Object> motion) {
        this.motion.addAll(motion);
    }

    public void lossHealth(int damage){
        health -= damage;
    }

    // return 1 live, return 0 die
    public boolean isLive(){
        return health > 0 ? true : false;
    }

    public String sayAboutYourself(boolean getHealth){
        String st = getRace() +
                " " + getName();
        if (getHealth){
            st += "(H:" + getHealth() + ")";
        }
        if (isVip()){
            st += "(VIP)";
        }
        if (isSick()){
            st += "(SICK)";
        }
        if (isBan()){
            st += "(BAN)";
        }
        return st;
    }
}
