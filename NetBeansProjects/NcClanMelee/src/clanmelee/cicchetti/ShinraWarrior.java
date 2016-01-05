/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package clanmelee.cicchetti;

import clanmelee.ClanMember;
/**
 *
 * @author nicholascicchetti
 
public class ShinraWarrior extends ClanMember
{
    private final int attackPoints;
  
  public ShinraWarrior(int clanID, int hitPoints, int attackPoints) {
    super(clanID, ClanMember.ClanMemberType.WARRIOR, hitPoints);
    this.attackPoints = attackPoints;
  }
  
  @Override
  protected int decideActionPoints(ClanMember.ClanMemberType type, int clanID, int hitPoints, int maxHitPoints) {
    int diffOfHp = this.getHitPoints() - hitPoints;
      if(clanID != getClanID() && (this.getHitPoints() / 2) < (hitPoints))
          return 0;
      else if (clanID != getClanID())
            return attackPoints;
      else if(clanID != getClanID() && (this.getHitPoints() == hitPoints))
          return hitPoints;
      else if((clanID != getClanID()) && ( hitPoints < 10 + (2*this.getHitPoints())))
              return hitPoints;
      else
          return 0;
  }
}
*/
