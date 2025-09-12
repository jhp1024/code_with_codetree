#include <iostream>
using namespace std;

int main() {
    int arr[4][4];
    int arr_sum = 0;

    for (int i=0; i < 4; i++) {
        for (int j=0; j < 4; j++) {
            cin >> arr[i][j];
            arr_sum += arr[i][j];
        }
        cout << arr_sum << endl;
        arr_sum = 0;
    }

    // Please write your code here.
    return 0;
}