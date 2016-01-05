/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package clanmelee.cicchetti;

import clanmelee.cicchetti.AvalancheWarrior;
import clanmelee.ClanMember;
import static clanmelee.ClanMember.ClanMemberType.WARRIOR;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author nicholascicchetti
 
public class AvalancheWarriorTest
{
    
    AvalancheWarrior aw;
    int threshold;
    int clanID;
    

    @Before
    public void setUp()
    {
        clanID = 3;
        aw = new AvalancheWarrior(clanID, 10,100);
        threshold = 25;
    }


    @Test
    public void testAboveThreshold()
    {
        int actionPoints = aw.decideActionPoints(WARRIOR, 0, 50, 102);
        assertEquals(102, actionPoints);
    }

    @Test
    public void testBelowThreshold()
    {
        aw.dealDamage(75);
        int actionPoints = aw.decideActionPoints(WARRIOR, 0, 50, 102);
        assertEquals(102, actionPoints);
    }

    @Test
    public void testSameClan()
    {
        int actionPoints = aw.decideActionPoints(WARRIOR, clanID, 50, 100);
        assertEquals(0, actionPoints);
    }
    
    @Test
    public void testEqualHitPoints()
    {
        int enemyActionPoints = aw.decideActionPoints(WARRIOR, 1, 10, 100);
        assertEquals(100, enemyActionPoints);
        
        
    }
    
    @Test
    public void testEnemyHasMoreHitPoints()
    {
        int actionPoints = aw.decideActionPoints(WARRIOR, clanID, 1, 100);
        int enemyActionPoints = aw.decideActionPoints(WARRIOR, 1, 10, 100);
        assertEquals(0, actionPoints);
    }
    
    @Test
    public void testPrevHP()
    {
        
        assertEquals(10, aw.getHitPoints());
    }
    
}
*/