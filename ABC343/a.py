a, b = map(int,input().split())
c = a + b
for i in range(10):
    if i != a and i != b and i != c:
        exit(print(i))