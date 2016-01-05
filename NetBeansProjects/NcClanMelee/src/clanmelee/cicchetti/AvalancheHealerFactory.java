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

public class AvalancheHealerFactory extends Clan
{

    public AvalancheHealerFactory(int clanID, int hitPoints)
    {
        super("Cicchetti Clan", clanID, hitPoints);
    }

    

    @Override
    public Collection<ClanMember> getClanMembers()
    {
       ArrayList<ClanMember> clanMembersWarriors = new ArrayList<>();
        while (availableHitPoints >= availableHitPoints/4)
        {
            int nextHP = 50;
            
            clanMembersWarriors.add(new ShinraWarrior(getClanID(),nextHP,5));
            
            availableHitPoints -= nextHP;
        }
        
            
        return clanMembersWarriors;
    }
    
}
*/
