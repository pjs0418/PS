num = int(input())

list_int = list(map(int, input().split()))
dp = [0 for i in range(num + 1)]

dp[1] = list_int[0]

for i in range(2, num + 1):
    for j in range(1, i):
        dp[i] = max(dp[i], dp[j] + dp[i - j])
    dp[i] = max(dp[i], list_int[i - 1])

print(dp[num])
