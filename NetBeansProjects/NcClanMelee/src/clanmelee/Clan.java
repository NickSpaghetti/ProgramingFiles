package clanmelee;

import java.util.Collection;

public abstract class Clan {
  private final String clanName;
  private final int clanID;
  
  public Clan(String clanName, int clanID) {
    this.clanName = clanName;
    this.clanID = clanID;
  }
  
  public int getClanID() {
    return clanID;
  }
  
  public String getClanName() {
    return clanName;
  }
  
  public abstract Collection<ClanMember> getClanMembers(int hitPoints);
}
