interface Player{

}
public class Main {
    public static void main(String[] args) {

        BaseballTeam Liverpool = new BaseballTeam("Liverpool");
        BaseballTeam City = new BaseballTeam("Man City");
        scoreResult(Liverpool, 100, City, 2);
        var salah = new BaseballPlayer("Salah", "Attack");
        var alisson = new BaseballPlayer("Alisson", "Keeper");

        Liverpool.addTeamMember(salah);
        Liverpool.addTeamMember(alisson);
        Liverpool.listTeamMembers();

    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }


}


record BaseballPlayer(String name, String position) {
}