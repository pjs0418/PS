import sys
input = sys.stdin.readline

N, M, B = map(int, input().split())
mat = [list(map(int, input().split())) for i in range(N)]

result = 1e9
min = resultIdx = min(map(min, mat))
max = max(map(max, mat))

for i in range(min, max + 1):
    count1 = count2 = 0

    for j in range(N):
        for k in range(M):
            if i < mat[j][k]:
                count1 += mat[j][k] - i
            else:
                count2 += i - mat[j][k]

    if B < count2 - count1:
        continue

    temp = 2 * count1 + count2

    if result >= temp:
        result = temp
        resultIdx = i

print(result, resultIdx)
