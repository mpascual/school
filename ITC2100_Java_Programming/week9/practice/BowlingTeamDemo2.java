import java.util.*;

public class BowlingTeamDemo {
  public static void main(String[] args) {
    String name;
    final int NUM_TEAMS = 4;
    BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
    //BowlingTeam bowlTeam = new BowlingTeam();
    int x;
    int y;
    final int NUM_TEAM_MEMBERS = 4;

    Scanner input = new Scanner(System.in);
    for(y = 0; y < NUM_TEAMS; ++y) {
      teams[y] = new BowlingTeam();
    


    System.out.println("Enter team name >> ");
    name = input.nextLine();
    bowlTeam.setTeamName(name);

    for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
      System.out.println("Enter team member's name >> ");
      name = input.nextLine();
      bowlTeam.setMember(x, name);
    }

    System.out.println("\nMembers of team " + bowlTeam.getTeamName());
    for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
      System.out.print(bowlTeam.getMember(x) + " ");
    }
    System.out.println();
  }
}
