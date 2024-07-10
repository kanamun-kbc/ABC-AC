n = int(input())
Takahashi = 0
Aoki = 0

for i in range(n):
    input_string = input()
    row = [int(num) for num in input_string.split()]
    Takahashi += row[0]
    Aoki += row[1]

if Takahashi > Aoki:
    print("Takahashi")
elif Takahashi < Aoki:
    print("Aoki")
else:
    print("Draw")
