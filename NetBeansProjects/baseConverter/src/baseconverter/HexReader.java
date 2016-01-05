/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconverter;

import java.util.ArrayList;

/**
 *
 * @author Nick
 */
public class HexReader
{

    private ArrayList<String> HexList = new ArrayList();

    public HexReader()
    {

    }

    public void addHex(String i)
    {
        HexList.add(i);
    }
    
    public void HexConverter()
    {
        for (int z = 0; z < HexList.size(); z++)
        {
           HexReader.this.convertLine(HexList.get(z));
        }
    }
    
    private void convertLine(String code)
    {
        try{
        for (int c = 0; c < code.length(); c++)
        {
            String sub = code.substring(c);
            long num = Integer.parseInt(code, 16);
            
            if (num == 256) 
                {
                    return;
                }
            System.out.println(num);
        }
        }catch (NumberFormatException nfe){
            System.out.println("Too big of a nuber");
        }
        
    }

    public void RunHexReader()
    {
        for (int j = 0; j < HexList.size(); j++)
        {
            HexReader.this.readLine(HexList.get(j));
        }

    }

    private void readLine(String code)
    {
        try
        {
            for (int c = 0; c + 1 < code.length(); c += 2)
            {
                String sub = code.substring(c, c + 2);
                int num = Integer.parseInt(sub, 16);
                if (num == 256)
                {
                    return;
                }
                System.out.println(num + " ");
            }
        }
        finally
        {
            System.out.println("**");
        }
        
    }

}
