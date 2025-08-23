#include <iostream>
using namespace std;

int main() {
    int n;
    int array[n];

    cin >> n;

    for(int i = 0; i < n; i++) {
        cin >> array[i];
        cout << array[i]*array[i] << " ";
    }
    return 0;
}