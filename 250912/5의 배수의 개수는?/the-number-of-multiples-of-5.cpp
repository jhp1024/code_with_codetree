#include <iostream>
using namespace std;

int main() {
    int arr[4][4];
    int result = 0;
    
    for (int i=0; i < 4; i++) {
        for (int j=0; j < 4; j++) {
            cin >> arr[i][j];
            if (arr[i][j] % 5 == 0) {
                result += 1;
            }
        }
    }

    cout << result << endl;
    // Please write your code here.
    return 0;
}