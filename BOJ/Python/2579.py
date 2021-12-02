num = int(input())
list_int = []
dp = [0 for i in range(num)]

for i in range(num):
    list_int.append(int(input()))

if num == 1:
    print(list_int[0])
elif num == 2:
    print(list_int[0] + list_int[1])
elif num == 3:
    print(list_int[2] + max(list_int[0], list_int[1]))
else:
    dp[0] = list_int[0]
    dp[1] = list_int[0] + list_int[1]
    dp[2] = list_int[2] + max(list_int[0], list_int[1])

    for i in range(3, len(list_int)):
        dp[i] = max(list_int[i] + list_int[i - 1] + dp[i - 3], list_int[i] + dp[i - 2])    

    print(dp[num - 1])