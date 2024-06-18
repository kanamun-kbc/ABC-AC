n, q = map(int,input().split())
t_list = list(map(int,input().split()))
disc = []
for i in range(len(t_list)):
    if t_list[i] in disc:
        disc.remove(t_list[i])
    else:
        disc.insert(-1,t_list[i])
print(n - len(disc))