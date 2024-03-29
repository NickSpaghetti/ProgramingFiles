/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clanmelee.cicchetti;

import clanmelee.ActionPointDecider;
import clanmelee.ClanMember;
import static clanmelee.ClanMember.ClanMemberType.*;
import clanmelee.Clan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author nicholascicchetti
 */
public class GullwingsClan extends Clan
{

    public GullwingsClan(String clanName, int clanID)
    {
        super("Spaghetti Clan", clanID);
    }

    

    @Override
    public Collection<ClanMember> getClanMembers(int hitPoints)
    {
        ArrayList<ClanMember> createClanMember = new ArrayList<>();
        ActionPointDecider decider = new GullWingsDecider(10);
        boolean nextIsWarrior = true;
        
        while (hitPoints > 0)
        {
            int nextHP = 10;

            if(hitPoints >= 100000)
            {
                nextHP = 1000;
            }
            else if(hitPoints >= 1000)
            {
                nextHP = 100;
            }
            else if (hitPoints < 10)
            {
                nextHP = hitPoints;
            }

            if (nextIsWarrior)
            {
                createClanMember.add(new ClanMember(getClanID(), WARRIOR, nextHP, decider));
            }
            else
            {
                createClanMember.add(new ClanMember(getClanID(), HEALER, nextHP, decider));
            }

            hitPoints -= nextHP;
            nextIsWarrior = !nextIsWarrior;
        }

        return createClanMember;
    }

}
