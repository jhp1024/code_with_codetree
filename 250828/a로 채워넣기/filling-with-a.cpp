#include <iostream>
using namespace std;

int main() {
    string a;

    cin >> a;

    a[1] = 'a';
    a[a.length()-2] = 'a';
    cout << a;
    // Please write your code here.
    return 0;
}