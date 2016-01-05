/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package clanmelee.cicchetti;

import clanmelee.ClanMember;


/**
 *
 * @author nicholascicchetti
 
public class AvalancheHealer extends ClanMember
{
    private int healPoints;
    
   public AvalancheHealer(int clanID, int hitPoints, int healPoints) {
    super(clanID, ClanMember.ClanMemberType.HEALER, hitPoints);
    this.healPoints = healPoints;
  }

    @Override
    protected int decideActionPoints(ClanMemberType type, int clanID, int hitPoints, int maxHitPoints)
    {
        if (clanID == getClanID() && hitPoints != maxHitPoints)
      return healPoints;
      else if (clanID != getClanID() && hitPoints != maxHitPoints)
          return 1;
      else
        return 0; 
    
    }
        
    

  
    
}
*/