/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on September 20, 2015, 1:19 AM
 */

#include <stdio.h>
#include <stdlib.h>

int sum(int a, int b) {

    if (b >= a) {
        return b * b + sum(a, b - 1);
    }

    return 0;

}

int main(int argc, char** argv) {


    int a, b;

    scanf("%d%d", &a, &b);

    printf("%d", sum(a, b));

    return 0;
}

