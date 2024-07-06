"""
与えられたN要素の数列Aから任意のK要素を削除したときの
余ったAの最大値と最小値の差、の最小値
"""
def min_difference(N, K, A):
    A.sort()  # 数列をソートする
    min_dif = float('inf')
    
    # 連続するN-K要素の部分列を検討
    for i in range(N - (N - K) + 1):
        dif = A[i + (N - K) - 1] - A[i]
        min_dif = min(min_dif, dif)
    
    return min_dif

# 入力を受け取る
N, K = map(int, input().split())
A = list(map(int, input().split()))

# 結果を出力する
result = min_difference(N, K, A)
print(result)
