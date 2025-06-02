x = int(input())
n = []

for _ in range(x):
    num = int(input())
    n.append(num)

for num in sorted(set(n)):
    print(num)

