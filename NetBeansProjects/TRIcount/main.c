/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on September 6, 2015, 3:20 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int t;
    scanf("%d",&t);
    while(t--)
    {
        unsigned long long n;
        scanf("%llu",&n);
        unsigned long long ans;
        ans=(n*(n+2)*(2*n+1)/8);
        printf("%llu\n",ans);
    }
    return (EXIT_SUCCESS);
}

