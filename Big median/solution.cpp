#include <bits/stdc++.h> // header file includes every Standard library
#include <iostream>
#include <algorithm>
using namespace std;

long long needCounts(int mid, int arr[], int n)
{
    long long sum = 0;
    for (int i = n / 2; i < n; i++)
    {
        if (arr[i] < mid)
            sum += mid - arr[i];
    }
    return sum;
}

int main()
{
    // Your code here
    int n, k;
    cin >> n >> k;
    int arr[n];

    for (int i = 0; i < n; i++)
        cin >> arr[i];

    sort(arr, arr + n);

    long long start = 0, end = 2e9;
    long long res = 0;
    while (start <= end)
    {
        long long mid = start + (end - start) / 2;

        if (needCounts(mid, arr, n) > k)
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
            res = mid;
        }
    }
    cout << res;
    return 0;
}