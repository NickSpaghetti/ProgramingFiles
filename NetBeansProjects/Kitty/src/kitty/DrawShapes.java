/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitty;

/**
 *
 * @author Nick
 */
public class DrawShapes
{

    char character = ' ';

    public DrawShapes(char newCharacter)
    {
        character = newCharacter;
    }

    public void drawTriangle(int size)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(character);
            }
            System.out.println("");
        }

    }

    public void drawPyramid(int size)
    {
        int a = size;
        int spaces = size;
        int count;

        for (int i = 0; i < size; i++)
        {
            count = spaces;
            while(spaces > 0)
            {
                System.out.print(" ");
                spaces--;
            }
            for(int j = 0; j < i; j++)
            {
                System.out.print(character + " ");
            }
            System.out.println("");
            spaces = count - 1;
        }

    }
}
