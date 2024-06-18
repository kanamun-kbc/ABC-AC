s = input()
t = input()
result = []
j = 0
for i in range(len(t)):
    if t[i] == s[j]:
        result.append(i + 1)
        j += 1
print(*result)