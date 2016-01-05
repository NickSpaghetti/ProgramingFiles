/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package clanmelee.cicchetti;

import clanmelee.cicchetti.ShinraHealer;
import clanmelee.ClanMember;
import static clanmelee.ClanMember.ClanMemberType.HEALER;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author nicholascicchetti
 
public class ShinraHealerTest
{
    
    ShinraHealer sh;
    int threshold;
    int clanID;
    

    @Before
    public void setUp()
    {
        clanID = 3;
        sh = new ShinraHealer(clanID, 100,10);
        threshold = 25;
    }
    
    
   @Test
    public void testAboveThreshold()
    {
        int actionPoints = sh.decideActionPoints(HEALER, 0, 50, 100);
        assertEquals(0, actionPoints);
    }


    @Test
    public void testSameClan()
    {
        int actionPoints = sh.decideActionPoints(HEALER, clanID, 50, 100);
        assertEquals(10, actionPoints);
    }
    
    @Test
    public void testDiffrentClan()
    {
        int doesItHeal = sh.decideActionPoints(HEALER, 1, 40, 66);
        
        assertEquals(0,doesItHeal);
    }
}
*/