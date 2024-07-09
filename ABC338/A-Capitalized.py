"""
capitalizeかどうか
(s.istitle()で分岐でも可)
"""
s = input()
sd = s.capitalize()
if s == sd:
    print("Yes")
else:
    print("No")