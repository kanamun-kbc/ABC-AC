text = input()
sub = set()
for n in range(1, len(text) + 1):
    for i in range(0, len(text) - n + 1):
        sub.add(text[i:i + n])
print(len(sub))