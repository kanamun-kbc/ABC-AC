n, m = list(map(int, input().split()))
h_list = list(map(int, input().split()))
total = 0
result = 0
for i in range(n):
    total += h_list[i]
    if total > m:
        break
    result += 1
print(result)