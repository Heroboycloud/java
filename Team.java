/** * Brief summary of this class, ending with a period. * * It is common to leave a blank line between the summary and further details. * The summary (everything before the first period) is used in the class or package * overview section. * * The following inline tags can be used (not an exhaustive list): * {@link some.other.class.Documentation} for linking to other docs or symbols * {@link some.other.class.Documentation Some Display Name} the link's appearance can be * customized by adding a display name after the doc or symbol locator * {@code code goes here} for formatting as code * {@literal <>[]()foo} for interpreting literal text without converting to HTML markup * or other tags. * * Optionally, the following tags may be used at the end of class documentation * (not an exhaustive list): * * @author John Doe * @version 1.0 * @since 5/10/15 * @see some.other.class.Documentation * @deprecated This class has been replaced by some.other.package.BetterFileReader *
*/

public class Team {
Member member;
public Team(Member member){
this.member= member;
}
public static void main(String[] args){
Member myMember= new Member("Daniel","light",12,1);
Team myTeam= new Team(myMember);
System.out.println(myTeam.member.getName());
System.out.println(myTeam.member.getType());
System.out.println(myTeam.member.getLevel());
System.out.println(myTeam.member.getRank());
}
}
class Member {
private String name;
private String type;
private int level;
private int rank;
public Member(String name, String type, int level, int rank) {    this.name = name;    this.type = type;    this.level = level;    this.rank = rank;  }
public String getName(){
return this.name; }
public String getType(){ return this.type; }
public int getLevel(){ return this.level; }
public int getRank(){ return this.rank; }
}
