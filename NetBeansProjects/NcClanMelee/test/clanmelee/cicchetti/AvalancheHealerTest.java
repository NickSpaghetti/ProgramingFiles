/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package clanmelee.cicchetti;

import clanmelee.cicchetti.AvalancheHealer;
import clanmelee.ClanMember;
import static clanmelee.ClanMember.ClanMemberType.HEALER;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author nicholascicchetti
 
public class AvalancheHealerTest
{
    
     
    AvalancheHealer ah;
    int threshold;
    int clanID;
    

    @Before
    public void setUp()
    {
        clanID = 3;
        ah = new AvalancheHealer(clanID, 100,10);
        threshold = 25;
    }
    
     @Test
    public void testAboveThreshold()
    {
        int actionPoints = ah.decideActionPoints(HEALER, 0, 50, 100);
        assertEquals(1, actionPoints);
    }


    @Test
    public void testSameClan()
    {
        int actionPoints = ah.decideActionPoints(HEALER, clanID, 50, 100);
        assertEquals(10, actionPoints);
    }
    
    @Test
    public void testDiffrentClan()
    {
        int doesItHeal = ah.decideActionPoints(HEALER, 1, 40, 66);
        
        assertEquals(1,doesItHeal);
    }
}
    

*/