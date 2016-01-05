/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on September 7, 2015, 9:01 AM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * find the number of trailing zeros of any given !
 * store 5^12 in an array
 * take the number of trailing zeros you want to solve for
 * 
 */

int main(int argc, char** argv) {
    int five[12];
    int tmp = 1;
    for (int i = 0; i < 12; i++) {
        tmp *= 5;
        five[i] = tmp;
    }

    int t;
    scanf("%d", &t);
    while (t--) {
        int x;
        scanf("%d", &x);
        int result = 0;
        for (int i = 0; i < 12; i++)
            result += x / five[i];
        printf("%d\n", result);
    }
    return (EXIT_SUCCESS);
}

