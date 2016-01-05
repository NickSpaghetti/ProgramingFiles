/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clanmelee.cicchetti;
import clanmelee.ClanMember;
import clanmelee.Clan;
import clanmelee.ClanMeleeConstants;
import clanmelee.ActionPointDecider;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author nicholascicchetti
 */
public class CicchettiClan extends Clan
{
    private GullwingsClan GWC;
    private SphereHunterClan SHC;

    public CicchettiClan(String clanName, int clanID)
    {
        super("Saghetti Clan", clanID);
        this.GWC = new GullwingsClan("Spaghetti Clan", clanID);
        this.SHC = new SphereHunterClan("Spaghetti Clan", clanID);
    }

    @Override
    public Collection<ClanMember> getClanMembers(int hitPoints)
    {
        int firstClanHP = 0;
        int secondClanHP = 0;
        if(hitPoints%2==0){
            firstClanHP = hitPoints/2;
            secondClanHP = hitPoints/2;
        }
        else{
            firstClanHP = hitPoints/2;
            secondClanHP = hitPoints/2;
        }
        ArrayList<ClanMember> clanMembers = new ArrayList<>();
        
        for(ClanMember gwc: GWC.getClanMembers(firstClanHP))
        {
            clanMembers.add(gwc);
        }
        for(ClanMember shc: SHC.getClanMembers(secondClanHP))
        {
            clanMembers.add(shc);
        }
        return clanMembers;
        
    }

  
     
}
