num = int(input())
arr = [list(map(int, input().split())) for i in range(num)]

arr.sort()

for i in range(num):
    print(arr[i][0], arr[i][1])
