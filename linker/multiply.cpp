#include <iostream>

void Log(int answer);
static int multiply(int a, int b) {
    int ans = a * b;
    Log(ans);
    return ans;
}

int main() {
    std::cout << multiply(5, 4) << "\n";
}