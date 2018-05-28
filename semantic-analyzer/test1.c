// 測試重複宣告變數
#include <stdio.h>
#include <stdlib.h>

int main()
{
  // 宣告和初始化現在不能同時做
  // 在一行宣告多餘兩個變數只抓的到頭尾的變數，最好還是一行一行宣告...
  int x, y;
  x = 10;
  y = 20;
  // 重複宣告變數
  int x;
  int y;
  int z;
 /* do something here */
  return 0;
}
