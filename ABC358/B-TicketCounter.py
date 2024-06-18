n, a = map(int,input().split())
t_list = list(map(int,input().split()))
saitei = 0
for i in range(len(t_list)):
    if i == 0:
        saitei = t_list[0] + a
        print(saitei)
    else:
        if saitei >= t_list[i]:
            saitei += a
            print(saitei)
        else:
            saitei = t_list[i] + a
            print(saitei)
