N = int(input())
matrix1 = [input().strip() for _ in range(N)]
matrix2 = [input().strip() for _ in range(N)]

for i in range(N):
    for j in range(N):
        if matrix1[i][j] != matrix2[i][j]:
            print(f'{i+1} {j+1}')
            exit()