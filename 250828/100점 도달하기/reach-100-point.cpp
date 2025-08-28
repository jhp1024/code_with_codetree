#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    while (N<=100) {
        if (N < 60) {
            cout << "F ";
        } else if (N < 70) {
            cout << "D ";
        } else if (N < 80) {
            cout << "C ";
        } else if (N < 90) {
            cout << "B ";
        } else if (N <= 100) {
            cout << "A ";
        }

        N++;
    }

    // Please write your code here.
    return 0;
}