// 測試 for 迴圈
#include <stdio.h>
#include <stdlib.h>
// 測錯可以把 main() 括弧拔掉或者把 #include 的 ＃拔掉。
int main()
{
  // 宣告和初始化現在不能同時做
  int x, i;
  x = 0;
  // 我沒有 define i++ 這個用法，所以這邊要寫 i = i + 1
  for(i = 0; i < 10; i=i+1)
  {
    x = x + i;
  }
  return 0;
}