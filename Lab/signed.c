// This is hw1-part2 of the course "Digital Systems and Computer Structure"
// STUDENT NAME: Ma Jian
// STUDENT ID  : 800016925

/*
 IDEA:
 The signed char ranges from -128 to 127.
 Notice that if x and y have oppisite signs, the result will never overflow.
 The result will overflow iff the sum of x and y with same sign has an oppisite sign of theirs.
 Notice that if we compare 0 and -128, the result will be -128 > 0 when we use signed char.
 Hence we need to check if the number on the highest digit of sum is 1(when it is negative) or 0(when it is positive), by ANDING 128("10000000" in binary) and check that the result is 128(%10000000) or 0(%00000000).
 */

#include <stdio.h>

int main()
{
// !require: x and y are in [-128:127] and they are char.
	char x, y, sum;
	scanf("%hhi%hhi", &x, &y);
	
	sum = x + y;
	printf("%hhi\n", sum);
	if(((x > 0) && (y > 0) && ((sum & 128) == 128)) || ((x < 0) && (y < 0) && (sum & 128) == 0))
	{
		printf("YES\n");
	}
	else
	{
		printf("NO\n");
	}
// !ensure: overflow iff the sign of sum is opposite to the signs of x and y (x and y are with same signs).
	return 0;
}
