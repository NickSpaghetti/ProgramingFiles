/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconverter;

/**
 *
 * @author Nick
 */
public class BaseConverter
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HexReader Hex = new HexReader();
        Hex.addHex("");
        Hex.RunHexReader();
        Hex.HexConverter();
    }
    
}
