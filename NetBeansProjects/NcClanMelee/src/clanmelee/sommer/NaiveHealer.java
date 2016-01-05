/*
package clanmelee.sommer;

import clanmelee.ClanMember;

public class NaiveHealer extends ClanMember {
  private int healPoints;
  
  public NaiveHealer(int clanID, int hitPoints, int healPoints) {
    super(clanID, ClanMemberType.HEALER, hitPoints);
    this.healPoints = healPoints;
  }

  @Override
  protected int decideActionPoints(ClanMemberType type, int clanID,
          int hitPoints, int maxHitPoints) {
    if (clanID == getClanID())
      return healPoints;
    else
      return 0;
  }
}
*/