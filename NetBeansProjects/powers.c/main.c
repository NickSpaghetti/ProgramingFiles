/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on September 2, 2015, 7:18 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

void pows(int c)
{
    int x;
    int y = 1;
   for (x = 0; x < 10; x++)
    {
        if(x == 0)
        {
            y = 1;
            
        } else{
            y = y * c;
     printf("%d ", y);
        }
    } 
}

void printSquares(void) {
    int x;
    int y;
    printf("The first 10 powers of 2 are:\n");
    for (x = 0; x < 10; x++)
    {
        if(x == 0)
        {
            y = 1;
        } else{
            y = y * 2;
     printf("%d ", y);
        }
    }
    
}

int main(int argc, char** argv) {

    printSquares();
    printf("\n");
    pows(3);
}

