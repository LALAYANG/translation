

```java

```
/problems/1000/solutions/1000-2.cpp
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <cstring>
#include <bitset>
#include <cstdlib>
#include <iomanip>
#include <assert.h>
#include <ctime>

#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(a) (a).begin(),(a).end()
#define sz(a) (int)(a).size()
#define rep(i,a,b) for(int i=a;i<b;i++)
#define per(i,a,b) for(int i=b-1;i>=a;i--)
#define de(a) cout << #a << " = " << a << endl
#define dd(a) cout << #a << " = " << a << " "
#define be(a) a.begin(), a.end()
#define rbe(a) a.rbegin(), a.rend()
#define SZ(a) ((int)a.size())
#define reset(a,x) memset(a,x,sizeof(a))
#define MAX(a,b) ((a)>(b)?(a):(b))
#define MIN(a,b) ((a)<(b)?(a):(b))
#define ABS(a) ((a)<0?-(a):(a))
#define FOPI freopen("codecoder.in", "r", stdin)
#define FLOP freopen("codecoder.out", "w", stdout)

using namespace std;

typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int> pii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef set<int> si;

const int maxn = 1000000000;

int main() {
    int a, b;
    cin >> a >> b;
    int ans = 0;
    for (int i = 1; i <= a; i++) {
        if (b % i == 0 && b / i <= a) {
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}

/*

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <cstring>
#include <bitset>
#include <cstdlib>
#include <iomanip>
#include <assert.h>
#include <ctime>

#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(a) (a).begin(),(a).end()
#define sz(a) (int)(a).size()
#define rep(i,a,b) for(int i=a;i<b;i++)
#define per(i,a,b) for(int i=b-1;i>=a;i--)
#define de(a) cout << #a << " = " << a << endl
#define dd(a) cout << #a << " = " << a << " "
#define be(a) a.begin(), a.end()
#define rbe(a) a.rbegin(), a.rend()
#define SZ(a) ((int)a.size())
#define reset(a,x) memset(a,x,sizeof(a))
#define MAX(a,b) ((a)>(b)?(a):(b))
#define MIN(a,b) ((a)<(b)?(a):(b))
#define ABS(a) ((a)<0?-(a):(a))
#define FOPI freopen("codecoder.in", "r", stdin)
#define FLOP freopen("codecoder.out", "w", stdout)

using namespace std;

typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int> pii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef set<int> si;

const int maxn = 1000000000;

int main() {
    int a, b;
    cin >> a >> b;
    int ans = 0;
    for (int i = 1; i <= a; i++) {
        if (b % i == 0 && b / i <= a) {
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}

*/

/*

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <cstring>
#include <bitset>
#include <cstdlib>
#include <iomanip>
#include <assert.h>
#include <ctime>

#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(a) (a).begin(),(a).end()
#define sz(a) (int)(a).size()
#define rep(i,a,b) for(int i=a;i<b;i++)
#define per(i,a,b) for(int i=b-1;i>=a;i--)
#define de(a) cout << #a << " = " << a << endl
#define dd(a) cout << #a << " = " << a << " "
#define be(a) a.begin(), a.end()
#define rbe(a) a.rbegin(), a.rend()
#define SZ(a) ((int)a.size())
#define reset(a,x) memset(a,x,sizeof(a))
#define MAX(a,b) ((a)>(b)?(a):(b))
#define MIN(a,b) ((a)<(b)?(a):(b))
#define ABS(a) ((a)<0?-(a):(a))
#define FOPI freopen("codecoder.in", "r", stdin)
#define FLOP freopen("codecoder.out", "w", stdout)

using namespace std;

typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int> pii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef set<int> si;

const int maxn = 1000000000;

int main() {
    int a, b;
    cin >> a >> b;
    int ans = 0;
    for (int i = 1; i <= a; i++) {
        if (b % i == 0 && b / i <= a) {
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}

*/

/*

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <cstring>
#include <bitset>
#include <cstdlib>
#include <iomanip>
#include <assert.h>
#include <ctime>

#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(a) (a).begin(),(a).end()
#define sz(a) (int)(a).size()
#define rep(i,a,b) for(int i=a;i<b;i++)
#define per(i,a,b) for(int i=b-1;i>=a;i--)
#define de(a) cout << #a << " = " << a << endl
#define dd(a) cout << #a << " = " << a << " "
#define be(a) a.begin(), a.end()
#define rbe(a) a.rbegin(), a.rend()
#define SZ(a) ((int)a.size())
#define reset(a,x) memset(a,x,sizeof(a))
#define MAX(a,b) ((a)>(b)?(a):(b))
#define MIN(a,b) ((a)<(b)?(a):(b))
#define ABS(a) ((a)<0?-(a):(a))
#define FOPI freopen("codecoder.in", "r", stdin)
#define FLOP freopen("codecoder.out", "w", stdout)

using namespace std;

typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int> pii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef set<int> si;

const int maxn = 1000000000;

int main() {
    int a, b;
    cin >> a >> b;
    int ans = 0;
    for (int i = 1; i <= a; i++) {
        if (b % i == 0 && b / i <= a) {
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}

*/

/*

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <cstring>
#include <bitset>
#include <cstdlib>
#include <iomanip>
#include <assert.h>
#include <ctime>

#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(a) (a).begin(),(a).end()
#define sz(a) (int)(a).size()
#define rep(i,a,b) for(int i=a;i<b;i++)
#define per(i,a,b) for(int i=b-1;i>=a;i--)
#define de(a) cout << #a << " = " << a << endl
#define dd(a) cout << #a << " = " << a << " "
#define be(a) a.begin(), a.end()
#define rbe(a) a.rbegin(), a.rend()
#define SZ(a) ((int)a.size())
#define reset(a,x) memset(a,x,sizeof(a))
#define MAX(a,b) ((a)>(b)?(a):(b))
#define MIN(a,b) ((a)<(b)?(a):(b))
#define ABS(a) ((a)<0?-(a):(a))
#define FOPI freopen("codecoder.in", "r", stdin)
#define FLOP freopen("codecoder.out", "w", stdout)

using namespace std;

typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int> pii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef set<int> si;

const int maxn = 1000000000;

int main() {
    int a, b;
    cin >> a >> b;
    int ans = 0;
    for (int i = 1; i <= a; i++) {
        if (b % i == 0 && b / i <= a) {
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}

*/

/*

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <cstring>
#include <bitset>
#include <cstdlib>
#include <iomanip>
#include <assert.h>
#include <ctime>

#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(a) (a).begin(),(a).end()
#define sz(a) (int)(a).size()
#define rep(i,a,b) for(int i=a;i<b;i++)
#define per(i,a,b) for(int i=b-1;i>=a;i--)
#define de(a) cout << #a << " = " << a << endl
#define dd(a) cout << #a << " = " << a << " "
#define be(a) a.begin(), a.end()
#define rbe(a) a.rbegin(), a.rend()
#define SZ(a) ((int)a.size())
#define reset(a,x) memset(a,x,sizeof(a))
#define MAX(a,b) ((a)>(b)?(a):(b))
#define MIN(a,b) ((a)<(b)?(a):(b))
#define ABS(a) ((a)<0?-(a):(a))
#define FOPI freopen("codecoder.in", "r", stdin)
#define FLOP freopen("codecoder.out", "w", stdout)

using namespace std;

typedef long long ll;
typedef unsigned long long ull;
typedef pair<int,int> pii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef set<int> si;

const int maxn = 1000000000;

int main() {
    int a, b;
    cin >> a >> b;
    int ans = 0;
    for (int i = 1; i <= a; i++) {
        if (b % i == 0 && b / i <= a) {
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}

*/

/*

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <cmath>
#include <cstdio>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <cstring>
#include <bitset>
#include <cstdlib>
#include <iomanip>
#include <assert.h>
#include <ctime>

#define pb push_back
#define mp make_pair
#define fi first
#define se second
#define all(a) (a).begin(),(a).end()
#define sz(a) (int)(a).size()
#define rep(i,a,b) for(int i=a;i<b;i++)
#define per(i,a,b) for(int i=b-1;i>=a;i--)
#define de(a) cout << #a << " = " << a << endl
#define dd(a) cout << #a << " = " << a << " "
#define be(a) a.begin(), a.end()
#define rbe(a) a.rbegin(), a.rend()
#define SZ(a) ((int)a.size())
#define reset(a,x) memset(a,x,sizeof(a))
#define MAX(a,b) ((a)>(b)?(a
