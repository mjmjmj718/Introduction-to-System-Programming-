// This file is hw1 of the course "Digital Systems and Computer Stucture" 
// STUDENT NAME: Ma Jian
// STUDENT ID  : 800016925

/*
 IDEA:
 Unsigned char ranges from 0 to 255.
 The result will overflow iff sum < a and sum < b.
*/

#include <stdio.h>

int main()
{
// !require: a and b are in [0:255] and they are char.

	unsigned char a, b, sum;
	scanf("%hhu%hhu", &a, &b);

	sum = a + b;
	if(sum < a && sum < b)
	{
		printf("YES\n");
	}
	else
	{
		printf("NO\n");
	}
// !ensure: overflow iff sum < a and sum < b.
	return 0;
}
