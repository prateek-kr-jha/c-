#include <iostream>
#include <string>

void printString(std::string  str) {
    std::cout << str << "\n";
}

std::string DNAtoRNA(std::string dna){
    for(int i = 0; i < dna.length(); i++) {
        if(dna[i] == 'T') {
            dna[i] = 'U';
        }
    }
  return dna;
}

int main() {
    printString("enter dna sequence");
    std::string input{ };
    std::cin >> input;
    // std::cout << input.length();
    printString(DNAtoRNA(input));

}