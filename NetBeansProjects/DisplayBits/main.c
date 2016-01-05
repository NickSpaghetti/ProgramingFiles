/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on September 9, 2015, 8:10 PM
 */

#include <stdio.h>
#include <stdlib.h>
void display_bits (unsigned char u);
/*
 * 
 */
int main(int argc, char** argv) {
    unsigned char u;
    u = 0x2D;
    display_bits(u); // should print 00101101
    printf(" This is for 0x2D\n");
    u = 0xFE;
    display_bits(u); // should print 11111110
    printf(" This is for 0xFE\n");
    return 0;
    return (EXIT_SUCCESS);
}

    void display_bits (unsigned char u){
    char mask = 0x80;
    for (int i = 0; i < 8; i++) {
        if (u & mask) {
            printf("1");
        } else {
            printf("0");
        }
        u = u << 1;
    }
}


