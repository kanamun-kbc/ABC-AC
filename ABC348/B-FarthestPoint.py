import numpy as np

# 点の数を入力
N = int(input())

# 各点の座標を入力
XY = [list(map(float, input().split())) for _ in range(N)]

# 距離を計算する関数
def calculate_distance(point1, point2):
    # numpy配列に変換
    p1 = np.array(point1)
    p2 = np.array(point2)
    # ユークリッド距離を計算
    return np.linalg.norm(p1 - p2)

# 距離の二次元リストを初期化
dist = [[0.0] * N for _ in range(N)]

# 各点間の距離を計算
for i in range(N):
    for j in range(N):
        dist[i][j] = calculate_distance(XY[i], XY[j])
    max_value = max(dist[i])
    max_index = dist[i].index(max_value)
    # 1から始まるインデックスを出力
    print(max_index+1)

# 距離の二次元リストを表示 (デバッグ用)
# for row in dist:
#     print(row)
