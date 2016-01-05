/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package clanmelee.cicchetti;

import clanmelee.ClanMember;

import clanmelee.ClanMember;

/**
 *
 * @author nicholascicchetti
 
public class AvalancheWarrior extends ClanMember
{
    private final int attackPoints;
    
    public AvalancheWarrior(int clanID, int hitPoints, int attackPoints) {
    super(clanID, ClanMember.ClanMemberType.WARRIOR, hitPoints);
    this.attackPoints = attackPoints;
    }
    
    @Override
    protected int decideActionPoints(ClanMemberType type, int clanID, int hitPoints, int maxHitPoints)
    {
        prevHP();
        if(clanID != getClanID() && getHitPoints() < prevHP())
            return prevHP();
      else  if(clanID != getClanID() && (this.getHitPoints()) < (hitPoints))
          return attackPoints + 2;
      else if(clanID != getClanID() && (this.getHitPoints() == hitPoints))
          return attackPoints;
      else if((clanID != getClanID()) && ( hitPoints < 10 + (2*this.getHitPoints())))
              return hitPoints;
      else if (clanID != getClanID() && (getHitPoints() > 30))
      return attackPoints + 6;
      else
          return 0;
    }
    
    private int prevHP()
    {
        int pHP;
        pHP = getHitPoints();
        return pHP;
    }

    
}*/
