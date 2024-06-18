n = int(input())
for i in range(n):
    if (i+1) % 3 == 0:
        print("x", end='')
    else:
        print("o", end='')