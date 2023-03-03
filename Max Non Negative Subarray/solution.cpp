#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
int m = 100001;

int main()
{
    // Your code here
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int ans = 0;
    int cnt = 0;
    int res;
    for (int i = 0; i < n; i++)
    {
        if (a[i] > 0)
        {
            cnt++;
        }
        else
        {
            if (cnt > ans)
            {
                ans = cnt;
                res = i;
            }
            cnt = 0;
        }
    }
    if (cnt > ans)
    {
        ans = cnt;
        res = n;
    }
    for (int j = res - ans; j < res; j++)
    {
        cout << a[j] << " ";
    }
}