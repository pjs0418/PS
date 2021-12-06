num = int(input())
dp = [0 for i in range(31)]

dp[0] = 1
dp[2] = 3

for i in range(4, 31, 2):
    for j in range(0, i - 3, 2):
        dp[i] += dp[j] * 2
    dp[i] += dp[i - 2] * dp[2]

print(dp[num])