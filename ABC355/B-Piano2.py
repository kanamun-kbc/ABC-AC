n, m = list(map(int, input().split()))
a_list = list(map(int, input().split()))
b_list = list(map(int, input().split()))

c_list = sorted(a_list + b_list)

for i in range(len(c_list)-1):
    if c_list[i] in a_list and c_list[i+1] in a_list:
        print("Yes")
        exit()

print("No")

