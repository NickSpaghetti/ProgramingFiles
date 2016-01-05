/*
package clanmelee.sommer;

import clanmelee.ClanMember;

public class NaiveWarrior extends ClanMember {
  private final int attackPoints;
  
  public NaiveWarrior(int clanID, int hitPoints, int attackPoints) {
    super(clanID, ClanMemberType.WARRIOR, hitPoints);
    this.attackPoints = attackPoints;
  }

  @Override
  protected int decideActionPoints(ClanMemberType type, int clanID, int hitPoints, int maxHitPoints) {
    if (clanID != getClanID())
      return attackPoints;
    else
      return 0;
  }
}
*/