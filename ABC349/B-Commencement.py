from collections import defaultdict

s = input()

d = defaultdict(int)
for c in s:
    d[c] += 1

print(d)

ans = defaultdict(int)
for v in d.values():
    ans[v] += 1

print(ans)

print('Yes' if all([v == 2 for v in ans.values()])  else 'No')
