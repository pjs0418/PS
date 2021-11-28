num = int(input())
dp = []
t = 0

temp = input().split()
list_int = list(map(int, temp))

dp.append(list_int[0])

for i in range(1, num):
    for j in range(i):
        if list_int[j] < list_int[i]:
            if t < dp[j]:
                t = dp[j]
    dp.append(t + list_int[i])
    t = 0

print(max(dp))