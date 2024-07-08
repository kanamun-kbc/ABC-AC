"""
全て白('.')の盤面
現在地が白('.')なら黒('#')に塗って、時計回りに90°回り1マス進む
現在地が黒('#')なら白('.')に塗って、反時計回りに90°回り1マス進む
"""
h, w, n = map(int, input().split())
s = [["." for _ in range(w)] for _ in range(h)]
dx = [0, 1, 0, -1] # ↑→↓←の順番
dy = [-1, 0, 1, 0]

x, y, d = 0, 0, 0

for _ in range(n):
    if s[y][x] == ".":
        s[y][x] = "#"
        d = (d+1) % 4
    else:
        s[y][x] = "."
        d = (d-1) % 4
    x = (x + dx[d]) % w
    y = (y + dy[d]) % h

for r in s:
    print("".join(r))