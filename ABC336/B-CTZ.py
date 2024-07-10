"""
入力された10進数の数字を2真数にしたときの末尾の連続する0の数
"""
b_split=bin(int(input())).split('1')
print(len(b_split[-1]))

"""
n=int(input())
r=0
for i in range(31):
    a=n%2
    n/=2
    if a:
        print(r)
        break
    else:
        r+=1
"""