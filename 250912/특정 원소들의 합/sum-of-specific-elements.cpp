#include <iostream>
using namespace std;

int main() {
    int arr[4][4];
    int result = 0;

    for (int i=0; i < 4; i++) {
        for (int j=0; j < 4; j++) {
            cin >> arr[i][j];
            if(i==0&&j==0) {
                result += arr[i][j];
            } else if((i==1&&j==0)||(i==1&&j==1)) {
                result += arr[i][j];
            } else if(i==2&&j!=3) {
                result += arr[i][j];
            } else if(i==3) {
                result += arr[i][j];
            }
        }
    }

    cout << result << endl;
    // Please write your code here.
    return 0;
}