#include <stdio.h>
int main()
{
    // Enter your age and name, the program will name do a introduction of you.
    int age;
    char name[1024];
    printf("Enter your name\n");
    scanf("%s", name);
    printf("Enter your age\n");
    scanf("%d", &age);
    printf("Hello everyone, my name is %s and I'm %d years old\n", name , age);
    return 0;
}