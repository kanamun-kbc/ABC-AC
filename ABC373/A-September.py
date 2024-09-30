"""
i番目の文字列がi文字であるものの数
"""
print(sum(i+1 == len(input()) for i in range(12)))