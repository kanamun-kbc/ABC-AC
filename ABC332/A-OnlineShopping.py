"""
N種類の商品
i種類目の商品は1コp円でQコ買う
合計金額がS未満ならK円の送料がかかる
合計金額の値
"""
n, s, k = map(int, input().split())
pq = [list(map(int, input().split())) for _ in range(n)]
pqs = [p * q for p, q in pq]
t = sum(pqs)
print(t + k if t < s else t)


"""
芸術点100点のサンプルコード
n,s,k,*p=map(int,open(a:=0).read().split())
while p:a+=p.pop()*p.pop()
print(a+k*(s>a))
"""