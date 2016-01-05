/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on August 30, 2015, 9:05 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    int intvar;
    printf("The address of int far is %p. \n");
    scanf( "%d", &intvar);
    printf( "The value you entered was %d. \n", intvar);
    
    int age = 12;
    char fn[] = "Nicholas";
    char ln[] = "";
    printf("What is your last name and what is your age? \n");
    scanf("%s",ln);
    scanf("%d", &age);
    printf("Your name is %s %s and your age is %d", fn,ln,age);
    
    char str1[20], str2[30];

   printf("Enter name: ");
   scanf("%s", &str1);

   printf("Enter your website name: ");
   scanf("%s", &str2);

   printf("Entered Name: %s\n", str1);
   printf("Entered Website:%s", str2);

    
    int number = 22;
    int mynumber = 0;
    printf("%d",number);
    printf("\n");
    scanf("%d", &mynumber);
    printf("%d",mynumber);
    return (EXIT_SUCCESS);
}

