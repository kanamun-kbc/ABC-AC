"""
Aを基準にMおきにツリーが立っている
LとRの間には何本のツリーがあるか
"""
a,m,l,r=map(int,input().split())
print((r-a)//m-(l-a-1)//m)