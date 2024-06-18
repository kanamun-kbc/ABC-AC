n, m = list(map(int, input().split()))
a_list = list(map(int, input().split()))

nut_list = []
for i in range(n):
    x_list = list(map(int, input().split()))
    nut_list.append(x_list)

total_list = [0] * m  # total_listにm個の要素を確保

for j in range(n):
    for k in range(min(m, len(nut_list[j]))):
        total_list[k] += nut_list[j][k]

# print(f'total_list確認{total_list}')

flag = 1
for l in range(m):
    if a_list[l] > total_list[l]:
        # print(f'{a_list[l]}  {total_list[l]}')
        flag = 0
        break  # 条件を満たさない場合はループを早期終了

if flag == 1:
    print("Yes")
else:
    print("No")