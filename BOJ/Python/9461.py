num = int(input())
dp = [0 for i in range(100)]

dp[0] = 1
dp[1] = 1
dp[2] = 1
dp[3] = 2
dp[4] = 2

for i in range(num):
    case = int(input())

    if case < 6:
        print(dp[case - 1])
    else:
        for j in range(5, case):
            dp[j] = dp[j - 1] + dp[j - 5]
        print(dp[case - 1])