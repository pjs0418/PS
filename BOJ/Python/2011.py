num = input()
dp = [0 for i in range(len(num))]

if len(num) == 1:
    if ord(num) >= 49 and ord(num) <= 57:
        print(1)
    else:
        print(0)
elif len(num) == 2:
    if num[0] == '0':
        print(0)
    elif num[0] == '1':
        if num[1] == '0':
            print(1)
        else:
            print(2)
    elif num[0] == '2':
        if ord(num[1]) >= 49 and ord(num[1]) <= 54:
            print(2)
        else:
            print(1)
    else:
        if num[1] == '0':
            print(0)
        else:
            print(1)
else:
    if num[0] == '0':
        print(0)
    else:
        dp[0] = 1

        if num[1] == '0':
            if num[0] == '1' or num[0] == '2':
                dp[1] = 1
            else:
                print(0)
                exit()
        else:
            if num[0] == '1':
                dp[1] = 2
            elif num[0] == '2':
                if ord(num[1]) >= 49 and ord(num[1]) <= 54:
                    dp[1] = 2
                else:
                    dp[1] = 1
            else:
                dp[1] = 1

        for i in range(2, len(num)):
            if num[i] == '0':
                if num[i - 1] == '1' or num[i - 1] == '2':
                    dp[i] = dp[i - 2]
                else:
                    print(0)
                    exit()
            elif ord(num[i]) >= 49 and ord(num[i]) <= 54:
                if num[i - 1] == '1' or num[i - 1] == '2':
                    dp[i] = (dp[i - 1] % 1000000) + (dp[i - 2] % 1000000)
                else:
                    dp[i] = dp[i - 1]
            elif ord(num[i]) >= 55 and ord(num[i]) <= 57:
                if num[i - 1] == '1':
                    dp[i] = (dp[i - 1] % 1000000) + (dp[i - 2] % 1000000)
                else:
                    dp[i] = dp[i - 1]

        print(dp[len(num) - 1] % 1000000)
