/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package clanmelee.cicchetti;

import clanmelee.ClanMember;
import clanmelee.Clan;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author nicholascicchetti
 
public class ShinraWarriorFactory extends Clan
{

    public ShinraWarriorFactory( int clanID, int hitPoints)
    {
        super("Cicchetti Clan", clanID, hitPoints);
    }

    

 @Override
  public ArrayList<ClanMember> getClanMembers() {
    ArrayList<ClanMember> clanMembersWarrior = new ArrayList<>();
    
    boolean nextIsWarrior = true;
    
    while (availableHitPoints > availableHitPoints/4) {
      int nextHP = 50;
      if (availableHitPoints < 50)
        nextHP = availableHitPoints;
      
      availableHitPoints -= nextHP;
    }
    
    return clanMembersWarrior;
  }
            
        
        
           
}
*/