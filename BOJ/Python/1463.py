num = int(input())

list = [0, 0, 1, 1]

for i in range(4, num + 1):
    temp3 = temp2 = 1000000
    if i % 3 == 0:
        temp3 = list[i // 3]
    if i % 2 == 0:
        temp2 = list[i // 2]
    temp1 = list[i - 1]

    temp = [temp3, temp2, temp1]
    m = min(temp)

    list.append(m + 1)

print(list[num])