#include <iostream>
#include "sort.h"
using namespace std;

int nOfhighestArr(int arr[5], int n)
{

    int required = 0;
    sort(arr);
    required = arr[5 - n];

    return required;
}

int main()
{
    int arr[5] = {1002, 20, 32, 67, 8};
    int n = 4;

    cout << nOfhighestArr(arr, n);

    return 0;
}