/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clanmelee.cicchetti;

import clanmelee.ClanMember;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author nicholascicchetti
 */
public class GullwingsClanTest
{
    @Before
    public void setup()
    {
     GullwingsClan GWC = new GullwingsClan("GullWing", 0);
     GullWingsDecider GWD =  new GullWingsDecider(1000);
    }
    @Test
    public void Testiftheywork()
    {
      GullwingsClan GWC = new GullwingsClan("GullWing", 0);
    }
    
    @Test
    public void TestHP()
    {
        int hp [] ={10, 100,1000,898,1000000000};
        for(int hpzizzes: hp)
        {
            GullwingsClan GWC = new GullwingsClan("GullWing", 0);
            ArrayList<ClanMember> list = new ArrayList<>();
            list.addAll(GWC.getClanMembers(hpzizzes));
            int hps = 0;
            for (ClanMember cm : list)
            {
                hps += cm.getMaxHitPoints();
                        
            }
            assertEquals(hpzizzes,hps);
        }
    
    }

    
}
