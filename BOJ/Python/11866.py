N, K = map(int, input().split())

arr = [i for i in range(1, N + 1)]
temp = 0
result = []

while len(arr) != 0:
    temp += K - 1

    if temp < len(arr):
        result.append(arr[temp])
        del arr[temp]
    else:
        temp -= K - 1
        temp -= len(arr)

print('<', end='')
for i in range(len(result) - 1):
    print(str(result[i]) + ', ', end='')
print(str(result[N - 1]) + '>')
