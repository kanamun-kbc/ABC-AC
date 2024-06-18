import numpy as np

def create_fractal(n):
    if n == 0:
        return np.array([['#']])
    
    # 小さいサイズのフラクタルを生成
    smaller_fractal = create_fractal(n - 1)
    smaller_size = smaller_fractal.shape[0]
    
    # 新しいサイズ
    new_size = 3 * smaller_size
    
    # 全体を埋める配列を初期化
    fractal = np.full((new_size, new_size), '#')
    
    # 新しいフラクタルの構築
    for i in range(3):
        for j in range(3):
            if i == 1 and j == 1:
                # 中央部分を空白にする
                fractal[i * smaller_size:(i + 1) * smaller_size,
                        j * smaller_size:(j + 1) * smaller_size] = np.full((smaller_size, smaller_size), '.')
            else:
                # 他の部分には小さいフラクタルを配置
                fractal[i * smaller_size:(i + 1) * smaller_size,
                        j * smaller_size:(j + 1) * smaller_size] = smaller_fractal
    
    return fractal

# ユーザーからの入力
n = int(input())
if n == 0:
    print('#')
else:
    # フラクタルを生成して表示
    result = create_fractal(n)
    res = [''.join(row) for row in result]
    result_str = '\n'.join(res)
    print(result_str)


# お手本

# def f(n):
#     if n == 0:
#         return ["#"]
#     sub = f(n - 1)
#     l = len(sub)
#     ret = [["." for j in range(3 * l)] for i in range(3 * l)]
#     for I in range(3):
#         for J in range(3):
#             if I != 1 or J != 1:
#                 for i in range(l):
#                     for j in range(l):
#                         ret[I * l + i][J * l + j] = sub[i][j]
#     return ret


# ans = f(int(input()))
# for a in ans:
#     print("".join(a))
