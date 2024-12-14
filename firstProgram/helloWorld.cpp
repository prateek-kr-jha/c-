#include <iostream>
int pika() {
    std::cout << "Pika pi\n";
    return 0;
}
int main() {
    int x { 10 };
    auto result = (10 <=> 20) > 0;
    std::cout << x << " " << result << " " << "Hello world \n";
    pika();
}