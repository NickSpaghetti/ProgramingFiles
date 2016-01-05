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
 
public class CicchettiFactory extends Clan
{
private final int OGHP;
private ShinraWarriorFactory SWF;
private AvalancheWarriorFactory AWF;
private ShinraHealerFactory SHF;
private AvalancheHealerFactory AHF;

    
    

    public CicchettiFactory(String clanName, int clanID, int hitPoints)
    {
        super("Cicchetti Clan", clanID, hitPoints);
        this.OGHP = hitPoints;
        this.SWF = new ShinraWarriorFactory(clanID, OGHP/4);
        this.AWF = new AvalancheWarriorFactory(clanID, OGHP/4);
        this.SHF = new ShinraHealerFactory(clanID, OGHP/4);
        this.AHF = new AvalancheHealerFactory(clanID, OGHP/4);
        
    }

    @Override
    public Collection<ClanMember> getClanMembers()
    {
        ArrayList<ClanMember> clanMembers = new ArrayList<>();
        for(ClanMember swf: SWF.getClanMembers())
        {
            clanMembers.add(swf);
        }
        
        for(ClanMember awf: AWF.getClanMembers())
        {
            clanMembers.add(awf);
        }
        
        for(ClanMember shf: SHF.getClanMembers())
        {
            clanMembers.add(shf);
        }
        
        for(ClanMember ahf: AHF.getClanMembers())
        {
            clanMembers.add(ahf);
        }
        
        return clanMembers;
    }
    
}
*/