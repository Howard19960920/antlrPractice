#include <stdio.h>
#include <stdlib.h>
// 測錯可以把 return x+y; 的分號拔掉，或者讓 function 不 return
int addsum(int x, int y)
{
    return x+y;
}

int main()
{
    int x, y;
    //  現在一行只能初始化一個變數
    x = 5;
    y = 10;
    addsum(x, y);
    return 0;
}