n, k = map(int,input().split())
numbers = list(map(int,input().split()))
# print(numbers)
result = [num // k for num in numbers if num % k == 0]
print(*result, sep=' ')