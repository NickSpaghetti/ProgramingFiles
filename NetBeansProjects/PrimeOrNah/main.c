/* 
 * File:   main.c
 * Author: Nick
 *
 * Created on September 27, 2015, 9:06 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define _CRT_SECURE_NO_WARNINGS 1

#define i64 unsigned long long

/*
 * 
 */
int main(int argc, char** argv) {
    i64 n;
	int t;
	scanf("%d", &t);
	while(t--)
	{
		scanf("%llu", &n);
		if(miller(n,1)) printf("YES\n");
		else printf("NO\n");
	}

    return (EXIT_SUCCESS);
}

i64 mulmod(i64 a, i64 b, i64 c)
{
	i64 x = 0, y = a%c;
	while(b>0)
	{
		if(b&1) x = (x+y)%c;
		y = (y<<1)%c;
		b = b>>1;
	}
	return x;
}

i64 modulo(i64 a, i64 b, i64 c)
{
	i64 x = 1, y = a%c;
	while(b>0)
	{
		if(b&1) x = mulmod(x,y,c);
		y = mulmod(y,y,c);
		b = b>>1;
	}
	return x;
}

bool miller(i64 p, int iter)
{
	if(p<2) return false;
	if(p==2) return true;
	if(!(p&1)) return false;
	i64 s = p-1, a, temp, mod;
	while(!(s&1)) s = s>>1;
	for(int i=0; i<iter; i++)
	{
		a = rand()%(p-1)+1;
		temp = s;
		mod = modulo(a, temp, p);
		while(temp!=p-1 && mod!=1 && mod!=p-1)
		{
			mod = mulmod(mod, mod, p);
			temp = temp<<1;
		}
		if(mod!=p-1 && !(temp&1)) return false;
	}
	return true;
}

