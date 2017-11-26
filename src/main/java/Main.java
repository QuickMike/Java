
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ElfTeam elfTeam = new ElfTeam();
        HumanTeam humanTeam = new HumanTeam();
        OrcTeam orcTeam = new OrcTeam();
        UndeadTeam undeadTeam = new UndeadTeam();
        ArrayList<Person> teamA;
        ArrayList<Person> teamB;
        if (MRandom.coinFlip()){
            teamA = elfTeam.ElfTeam();
        }else {
            teamA = humanTeam.HumanTeam();
        }
        if (MRandom.coinFlip()){
            teamB = orcTeam.OrcTeam();
        }else {
            teamB = undeadTeam.UndeadTeam();
        }
        LogTextInFile.writeLog("Start Game\n\n", false);
        Report.setMaxLength(teamA, teamB, 10);
        LogTextInFile.writeLog(Report.infoTeamVS(teamA, teamB) + "\n");
        Fight.startFight(teamA, teamB);
    }
}
