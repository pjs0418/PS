temp = input().split()
list_int = list(map(int, temp))

dp = [[0 for i in range(list_int[1])] for j in range(list_int[0])]

for i in range(list_int[1]):
    dp[0][i] = i + 1;

for i in range(list_int[0]):
    dp[i][0] = 1;

for i in range(1, list_int[0]):
    for j in range(1, list_int[1]):
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1]

print(dp[list_int[0] - 1][list_int[1] - 1] % 1000000000)