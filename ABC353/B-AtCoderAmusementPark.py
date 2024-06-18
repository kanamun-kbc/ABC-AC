n, k = map(int, input().split())
human_list = list(map(int, input().split()))

attr_num = 1
group_index = 0
while group_index < n:
    attr_cap = 0
    for i in range(k+1):
        if group_index >= n:
            break
        attr_cap += human_list[group_index]
        if attr_cap > k:
            attr_cap -= human_list[group_index]
            attr_num += 1
            break
        else:
            group_index += 1
            continue
print(attr_num)

