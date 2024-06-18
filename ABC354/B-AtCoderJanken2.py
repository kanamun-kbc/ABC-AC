n=int(input())
total=0
x=[]
for i in range(n):
    a,b=input().split()
    x.append(a)
    total+=int(b)
print(sorted(x)[total%n])