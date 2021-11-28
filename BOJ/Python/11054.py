num = int(input())
dp = []
dpReverse = []
t = 0

temp = input().split()
list_int = list(map(int, temp))

dp.append(1)
dpReverse.append(1)

for i in range(1, num):
    for j in range(i):
        if list_int[j] < list_int[i]:
            if t < dp[j]:
                t = dp[j]
    dp.append(t + 1)
    t = 0

list_reverse = list(reversed(list_int))

for i in range(1, num):
    for j in range(i):
        if list_reverse[j] < list_reverse[i]:
            if t < dpReverse[j]:
                t = dpReverse[j]
    dpReverse.append(t + 1)
    t = 0

dpReverseR = list(reversed(dpReverse))

for i in range(len(dp)):
    dp[i] += dpReverseR[i]

print(max(dp) - 1)