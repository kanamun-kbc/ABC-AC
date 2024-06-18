import numpy as np

s = input()
s_list = list(s)
s_short = s.lower()
s_large = s.upper()
# print(s_short)
# print(s_large)
s_short_list = np.array(list(s_short))
# print(s_short_list)
short_match = list(s_list == s_short_list)
# print(short_match)
short_match_sum = sum(short_match)
# print(short_match_sum)
large_match_sum = len(s_list) - short_match_sum
if large_match_sum > short_match_sum:
    print(s_large)
else:
    print(s_short)