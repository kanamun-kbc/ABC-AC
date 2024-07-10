"""
バットとグローブ、値段が高いほうをプレゼント
"""
b, g = map(int,input().split())
print("Bat" if b > g else "Glove")