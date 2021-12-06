num = int(input())
dp = [0 for i in range(num + 1)]
square = [i*i for i in range(1,317)]

for i in range(1, num + 1):
    arr = []

    for j in square:
        if j > i:
            break;

        arr.append(dp[i - j])

    dp[i] = min(arr) + 1
    
print(dp[num])