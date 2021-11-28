num = int(input())
list = []
dp = []

for i in range(num):
    list.append(int(input()))

if num == 1:
    print(list[0])
elif num == 2:
    print(list[0] + list[1])
elif num == 3:
    temp = [list[0] + list[1], list[0] + list[2], list[1] + list[2]]
    print(max(temp))
else:
    dp.append(list[0])
    dp.append(list[0] + list[1])
    temp = [list[0] + list[1], list[0] + list[2], list[1] + list[2]]
    dp.append(max(temp))
    
    for i in range(3, num):
        dp.append(max(list[i] + list[i - 1] + dp[i - 3], list[i] + dp[i - 2]))
        dp[i] = max(dp[i], dp[i - 1])

    print(dp[num - 1])