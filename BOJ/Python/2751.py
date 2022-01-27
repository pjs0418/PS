num = int(input())
list_int = []

for i in range(num):
    list_int.append(int(input()))

list_int.sort()

for i in range(num):
    print(list_int[i])
