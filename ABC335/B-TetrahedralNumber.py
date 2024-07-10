"""
x+y+z<n の組み合わせを辞書順で表示
"""
N=int(input());print('\n'.join(f"{x} {y} {z}"for x in range(N+1)for y in range(N-x+1)for z in range(N-x-y+1)))
