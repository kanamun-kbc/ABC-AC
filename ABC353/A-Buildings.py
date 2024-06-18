n = int(input())
h_list = list(map(int, input().split()))

higher = h_list[0]
higher_index = -1
for i in range(len(h_list)):
    if h_list[i] > higher:
        higher = h_list[i]
        higher_index = i + 1
        break
print(higher_index)