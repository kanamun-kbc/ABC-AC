from itertools import combinations

def convert_row_to_bitvector(row, m):
    """行をビットベクトルに変換する"""
    bitvector = 0
    for j in range(m):
        if row[j] == 'o':
            bitvector |= (1 << j)
    return bitvector

def minimum_rows_to_cover(matrix, n, m):
    # 各行をビットベクトルに変換する
    bitvectors = [convert_row_to_bitvector(row, m) for row in matrix]
    all_columns_mask = (1 << m) - 1  # 全ての列をカバーするビットマスク（例：m=3なら111）

    min_rows = None
    min_row_count = n + 1

    # すべての部分集合を試す
    for r in range(1, n + 1):
        for rows in combinations(range(n), r):
            combined_vector = 0
            for row in rows:
                combined_vector |= bitvectors[row]
            if combined_vector == all_columns_mask:
                if len(rows) < min_row_count:
                    min_row_count = len(rows)
                    min_rows = rows

    return min_row_count, min_rows

# 標準入力からの入力を処理
n, m = map(int, input().split())
matrix = [input().strip() for _ in range(n)]

# 関数の呼び出し
result_count, result_rows = minimum_rows_to_cover(matrix, n, m)

# 結果の出力
print(result_count)
print(" ".join(map(str, result_rows)))
