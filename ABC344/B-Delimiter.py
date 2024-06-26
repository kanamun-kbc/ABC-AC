"""
0が入力されるまで入力、出力は逆順
"""
a_list = []
a = int(input())
a_list.append(a)
while a != 0:
    a = int(input())
    a_list.append(a)
print(*a_list[::-1], sep='\n')