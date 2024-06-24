n = int(input())
a_list = list(map(int,input().split()))
b_list =[a_list[i] * a_list[i+1] for i in range(len(a_list)-1)]
print(*b_list,sep=' ')