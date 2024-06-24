"""
部分文字列の探索
"""
roopstr = "wbwbwwbwbwbw"
len_roopstr = len(roopstr)
W, B = map(int,input().split())
# スタート位置ごとに繰り返す
for i in range(len_roopstr):
    num_w = 0
    num_b = 0
    # 文字列文、wとbをカウント
    for j in range(W + B):
        # ループ文字内の、スタート位置 + イテレータについて文字を確認
        if roopstr[(i+j) % len_roopstr] == "w":
            num_w += 1
        else:
            num_b += 1
    # 個数一致か確認、合っていなかったら同じ作業をする
    if num_w == W and num_b == B:
        print("Yes")
        exit()
print("No")