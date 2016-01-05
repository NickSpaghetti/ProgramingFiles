/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on September 28, 2015, 2:37 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {

    long long int n;
    scanf("%lld",&n);
    while(n)
    {
        printf("%lld\n",(n*(n+1)*(2*n+1))/6);
        scanf("%lld",&n);
    }
    
    return (EXIT_SUCCESS);
}

