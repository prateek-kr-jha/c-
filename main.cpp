#include <iostream>

int main() {
    int x { 14 };
    auto result = (10 <=> 20) > 0;
    std::cout << result << " hi there "  << std::endl;
    std::cin.get();
    std::cin >> x;
    std::cout << x << "\n";
}