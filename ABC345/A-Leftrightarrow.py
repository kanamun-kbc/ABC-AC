S = list(input())

if S[0] != "<" or S[len(S)-1] != ">":
  print("No")
  exit()

for i in range(1,len(S)-1):
  if S[i] != "=":
    print("No")
    exit()

print("Yes")