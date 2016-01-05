/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package clanmelee.cicchetti;

import clanmelee.cicchetti.CicchettiFactory;
import static clanmelee.ClanMember.ClanMemberType.HEALER;
import static clanmelee.ClanMember.ClanMemberType.WARRIOR;
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
 
public class CicchettiFactoryTest
{

    CicchettiFactory cfOH;
    CicchettiFactory cfOT;

    @Before
    public void setUp()
    {
        int clanID = 0;
        cfOH = new CicchettiFactory("Cicchetti Clan",clanID,100);
        cfOT = new CicchettiFactory("Cicchetti Clan",clanID,1000);

    }
    
    @Test
    public void testClanName()
    {
        String name = cfOH.getClanName();
        assertEquals("Cicchetti Clan", name);
    }
    
    @Test
    public void testNumberOfMembers()
    {
        ArrayList<ClanMember> arrayOHhp = (ArrayList<ClanMember>) cfOH.getClanMembers();
        ArrayList<ClanMember> arrayOThp = (ArrayList<ClanMember>) cfOT.getClanMembers();
        assertEquals(3, arrayOHhp.size());
        assertEquals(18, arrayOThp.size());
        
    }
    
   
}
*/