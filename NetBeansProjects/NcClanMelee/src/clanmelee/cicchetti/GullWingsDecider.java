/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clanmelee.cicchetti;

import clanmelee.ActionPointDecider;
import clanmelee.ClanMember;
import static clanmelee.ClanMember.ClanMemberType.HEALER;
import static clanmelee.ClanMember.ClanMemberType.WARRIOR;

/**
 *
 * @author nicholascicchetti
 */
class GullWingsDecider implements ActionPointDecider
{

    private int actionPoints = 0;

    public GullWingsDecider(int pramActionsPoints)
    {
        this.actionPoints = pramActionsPoints;
    }

    @Override
    public int decideActionPoints(ClanMember me, ClanMember other)
    {
        boolean sameClanID = me.getClanID() == other.getClanID();
        int enemyHeal = (actionPoints / actionPoints);

        if (sameClanID && me.getType() == HEALER)
        {
            return actionPoints;
        }
        else if(sameClanID && me.getType() == WARRIOR)
        {
            return 0;
        }
        else if (!sameClanID && other.getType() == WARRIOR)
        {
           if(me.getHitPoints() *2 <= other.getHitPoints())
           {
               return other.getHitPoints();
           } else {
               return 0;
           }

        }
        else if (!sameClanID && me.getType() == HEALER)
        {

            return enemyHeal;
        }
        return actionPoints;
    }

}
