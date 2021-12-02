num = int(input())
dp = []

temp = input().split()
list_int = list(map(int, temp))

dp.append(list_int[0])

for i in range(1, len(list_int)):
    dp.append(max(list_int[i], dp[i - 1] + list_int[i]))

print(max(dp))
