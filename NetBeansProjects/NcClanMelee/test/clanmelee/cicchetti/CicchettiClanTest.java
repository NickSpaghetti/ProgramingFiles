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
public class CicchettiClanTest
{
    
  @Before
  public void setUp()
  {
      String clanName = "Cicchetti Clan";
      int clanID = 0;
  }
   
  @Test
  public void createClanMembers()
  {
      CicchettiClan CC = new CicchettiClan("Cicchetti Clan",0);
      
      ArrayList<ClanMember> list = new ArrayList<>();
      
      for(ClanMember cm: CC.getClanMembers(10000))
      {
          list.add(cm);
          
      }
      
      
      
      
      
  }
  
  @Test
    public void TestHP()
    {
        int hp [] ={9,10,100,199,300,166,1000,2980};
        for(int hpzizzes: hp)
        {
            CicchettiClan CC = new CicchettiClan("GullWing", 0);
            ArrayList<ClanMember> list = new ArrayList<>();
            list.addAll(CC.getClanMembers(hpzizzes));
            int hps = 0;
            for (ClanMember cm : list)
            {
                hps += cm.getMaxHitPoints();
                        
            }
            assertEquals(hpzizzes,hps);
        }
    
    }
    
}
