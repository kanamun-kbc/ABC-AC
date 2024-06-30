s, t = input().split()
for i in range(1, len(s)):
  for j in range(i):
    if s[j::i] == t:
       exit(print('Yes'))
print('No')
