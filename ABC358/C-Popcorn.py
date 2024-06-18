from itertools import combinations

def is_covering_all_columns(matrix, selected_rows, m):
    covered_columns = set()
    for row in selected_rows:
        for col in range(m):
            if matrix[row][col] == 'o':
                covered_columns.add(col)
    return len(covered_columns) == m

def minimum_rows_to_cover(matrix, n, m):
    # 最小の行のセットを探す
    min_rows = None
    min_row_count = n + 1  # n+1は不可能な最大値として初期化
    
    for r in range(1, n + 1):
        for rows in combinations(range(n), r):
            if is_covering_all_columns(matrix, rows, m):
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