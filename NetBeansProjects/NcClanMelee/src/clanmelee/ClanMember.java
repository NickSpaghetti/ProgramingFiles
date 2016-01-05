package clanmelee;

import static clanmelee.ClanMeleeConstants.*;

public class ClanMember {
  public enum ClanMemberType {WARRIOR, HEALER};

  private final int clanID;
  private final ClanMemberType type;
  private int maxHitPoints;
  private int hitPoints;
  
  private ActionPointDecider decider;
  
  public ClanMember(int clanID, ClanMemberType type, int hitPoints,
          ActionPointDecider decider) {
    this.clanID = clanID;
    this.type = type;
    this.decider = decider;

    if (hitPoints > HIT_POINT_CAP)
      this.maxHitPoints = HIT_POINT_CAP;
    else
      this.maxHitPoints = hitPoints;

    this.hitPoints = this.maxHitPoints;
  }
  
  public int getClanID() {
    return clanID;
  }
  
  public ClanMemberType getType() {
    return type;
  }
  
  public int getHitPoints() {
    return hitPoints;
  }
  
  public int getMaxHitPoints() {
    return maxHitPoints;
  }
  
  /*
    Public way to get action points. Ensures no more than the max allowed
    action points are returned.
  */
  public int getActionPoints(ClanMember other) {
    int actionPoints = decider.decideActionPoints(this, other);
    int maxActionPoints = hitPoints * ACTION_POINTS_PER_ITERATION_DAMAGE_POINT
            + FREE_ACTION_POINTS;
    
    if (actionPoints > maxActionPoints)
      actionPoints = maxActionPoints;
    
    dealIterationDamage(actionPoints);
    
    return actionPoints;
  }
  
  private void dealIterationDamage(int actionPoints) {
    if (actionPoints > FREE_ACTION_POINTS) {
      int damage = (actionPoints - FREE_ACTION_POINTS - 1)
              / ACTION_POINTS_PER_ITERATION_DAMAGE_POINT + 1;
      dealDamage(damage);
    }

    maxHitPoints -= 1;
    if (hitPoints > maxHitPoints)
      hitPoints = maxHitPoints;
  }
  
  public void heal(int healPoints) {
    hitPoints += healPoints;
    if (hitPoints > maxHitPoints)
      hitPoints = maxHitPoints;
  }

  public void dealDamage(int damagePoints) {
    hitPoints -= damagePoints;
    if (hitPoints < 0)
      hitPoints = 0;
  }

  public boolean isAlive() {
    return hitPoints != 0;
  }
}
