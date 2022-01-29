from collections import Counter
import sys
input = sys.stdin.readline

num = int(input())
arr = [int(input()) for _ in range(num)]

print(round(sum(arr) / num))

arr.sort()

print(arr[num // 2])

temp = Counter(arr).most_common(2)
if len(temp) == 1:
    print(temp[0][0])
else:
    if temp[0][1] == temp[1][1]:
        print(temp[1][0])
    else:
        print(temp[0][0])

print(max(arr) - min(arr))
