/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on September 6, 2015, 2:24 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

int main(int argc, char** argv) {

    int t = 0;
    int n = 0;
    for(t = 2; t < 10; t++)
    {
    scanf("%d",&n);
    if(n % t == 0 && n != 1)
    {
        int x = n % t;
        printf("%d", x);
        printf("YES");
    } else{
        printf("NO");
    }
    }
    
    
    return (EXIT_SUCCESS);
}

