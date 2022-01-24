num = int(input())
count = 0

temp = input().split()
list_int = list(map(int, temp))

for i in range(num):
    if list_int[i] == 1:
        continue

    for j in range(2, list_int[i] + 1):
        if j == list_int[i]:
            count += 1

        if list_int[i] % j == 0:
            break

print(count)
