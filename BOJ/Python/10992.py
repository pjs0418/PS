num = int(input())

for i in range(num - 1):
    for j in range(num - i - 1):
        print(' ', end = '')
    print('*', end = '')
    for j in range(2 * i - 1):
        print(' ', end = '')
    if i != 0:
        print('*')
    else:
        print('')

for i in range(2 * num - 1):
    print("*", end = '')