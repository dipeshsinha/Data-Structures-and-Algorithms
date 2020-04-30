#include<iostream>
int add(int a, int b);
int main() {
    int a, b;
    std::cin>>a>>b;
    std::cout<<add(a,b);
}

int add(int a, int b) {
    return a + b;
}