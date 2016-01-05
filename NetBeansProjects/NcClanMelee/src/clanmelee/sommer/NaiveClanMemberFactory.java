/*
package clanmelee.sommer;

import clanmelee.ClanMember;
import clanmelee.Clan;
import java.util.ArrayList;

public class NaiveClanMemberFactory extends Clan {
  public NaiveClanMemberFactory(int clanID, int hitPoints) {
    super("Sommer Clan", clanID, hitPoints);
  }

  @Override
  public ArrayList<ClanMember> getClanMembers() {
    ArrayList<ClanMember> clanMembers = new ArrayList<>();
    
    boolean nextIsWarrior = true;
    
    while (availableHitPoints > 0) {
      int nextHP = 50;
      if (availableHitPoints < 50)
        nextHP = availableHitPoints;
      
      if (nextIsWarrior)
        clanMembers.add(new NaiveWarrior(getClanID(), nextHP, 5));
      else
        clanMembers.add(new NaiveHealer(getClanID(), nextHP, 5));
      
      availableHitPoints -= nextHP;
      nextIsWarrior = !nextIsWarrior;
    }
    
    return clanMembers;
  }
}
*/