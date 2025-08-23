#include <iostream>
using namespace std;

int main() {
    string array[10];
    int n;

    for(n=0; n < 10; n++) {
        cin >> array[n];
    }

    for(n=10; n > 0; n--) {
        cout << array[n-1];
    }
    // Please write your code here.
    return 0;
}