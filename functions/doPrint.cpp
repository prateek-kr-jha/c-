#include <iostream>
void doB() 
{
    std::cout<<"I am doB()\n";
}

void doPrint() 
{
    std::cout<<"I am doPrint()\n";
    doB();
}

int main() 
{
    doPrint();
    return 0;
}