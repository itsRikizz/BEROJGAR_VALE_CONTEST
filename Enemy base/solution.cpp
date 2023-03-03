#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

#define MEM(a, b) memset(a, (b), sizeof(a))
#define FOREACH(it, l) for (auto it = l.begin(); it != l.end(); it++)
#define IN(A, B, C) assert(B <= A && A <= C)
#define MP make_pair
#define FOR1(i, j, a) for (int i = j; i < a; i++)
#define FOR(i, a) for (int i = 0; i < a; i++)
#define EB emplace_back
#define INF (int)1e9
#define EPS 1e-9
#define PI = 3.1415926535897932384626433832795
#define max1 100001
#define MOD 1000000007
#define read(type) readInt<type>()
#define int long long
#define out(x) cout << x << '\n'
#define out1(x) cout << x << " "
#define END cout << '\n'
void fast()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
}
int n, d;
int a[max1], pre[max1];
bool check(int A)
{
    int cnt = 0;
    FOR(i, n)
    {
        if (a[i] <= A)
        {
            cnt++;
        }
        pre[i] = cnt;
    }
    int ans;
    FOR(i, n)
    {
        if (a[i] > A)
        {
            ans = pre[i];
            if (i > d)
            {
                ans -= pre[i - d - 1];
            }
            if (i + d < n)
            {
                ans += pre[i + d] - pre[i];
            }
            else
            {
                ans += pre[n - 1] - pre[i];
            }

            if (ans * A < a[i])
            {
                return false;
            }
        }
    }
    return true;
}
signed main()
{
    fast();

    cin >> n >> d;
    FOR(i, n) { cin >> a[i]; }
    int low = 1;
    int high = 10e10 + 1;
    while (low < high)
    {
        int middle = low + high;
        middle = middle / 2;
        if (check(middle) == true)
        {
            high = middle;
        }
        else
        {
            low = middle + 1;
        }
    }
    cout << low << endl;
}