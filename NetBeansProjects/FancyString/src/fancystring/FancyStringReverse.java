/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fancystring;
import java.util.Scanner;
/**
 *
 * @author nicholascicchetti
 */
public class FancyStringReverse implements FancyString
{

    FancyString base;
    char c;

    public FancyStringReverse(FancyString b, char c)
    {
        base = b;
        this.c = c;
    }
    
    @Override
  public String toString() {
    String[] lines = base.toString().split("\n");
    
    int maxLineLength = 0;
    for (String line : lines) {
      if (line.length() > maxLineLength) 
        maxLineLength = line.length();
    }
    
    for (int i = 0; i < lines.length; ++i) {
      if (lines[i].length() < maxLineLength) {
        for (int j = lines[i].length(); j < maxLineLength; ++j)
          lines[i] += ' ';
      }
      
      lines[i] = c + lines[i] + c;
      
      if (lines[i].length() > 80)
        lines[i] = lines[i].substring(0, 80);
    }
    
    String charLine = "";
    
    for (int i = 0; i < maxLineLength + 2; ++i)
      charLine += c;
    
    if (charLine.length() > 80)
      charLine = charLine.substring(0, 80);
    
    String finalString = charLine + '\n';
    
    for (String line : lines)
      finalString += line + '\n';
    
    finalString += charLine;
    
    return new StringBuilder(finalString).reverse().toString();
    
    
  }
  
    
}
