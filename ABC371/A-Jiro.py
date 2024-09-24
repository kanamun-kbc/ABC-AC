"""
三人の年齢の大小関係
"""

ab, ac, bc = map(str,input().split())
a, b, c = 0, 0, 0
if ab == "<":
    b+=1
else:
    a+=1
if ac == "<":
    c+=1
else:
    a+=1
if bc == "<":
    c+=1
else:
    b+=1
if a == 1:
    print("A")
elif b == 1:
    print("B")
else:
    print("C")


"""
お手本1
a,_,b,_,c=input();print(['AC'[a==b],'B'][a==c])
ブラケットを使うことで、TrueとFalse、つまり1と0でインデックス参照

お手本2
print("A B C"["< > > > < < < >".find(input())%6])

"""