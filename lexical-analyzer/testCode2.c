#include <stdio.h>
int main()
{
    /* Calculate Summation from 0 to 1023 and print it on console */
    int idx_i, sum;
    sum = 0;
    for(idx_i = 0; idx_i <= 1024; idx_i++)
    {
        sum += idx_i;
    }
    printf("%d\n", sum);
    return 0;
}