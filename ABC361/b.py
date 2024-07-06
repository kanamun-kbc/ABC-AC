"""
立方体の交差の有無
"""
def is_ol(cube1, cube2):
    a, b, c, d, e, f = cube1
    g, h, i, j, k, l = cube2

    x_ol = max(a, g) < min(d, j)
    y_ol = max(b, h) < min(e, k)
    z_ol = max(c, i) < min(f, l)

    return x_ol and y_ol and z_ol

cube1 = list(map(int, input().split()))
cube2 = list(map(int, input().split()))

if is_ol(cube1, cube2):
    print("Yes")
else:
    print("No")
