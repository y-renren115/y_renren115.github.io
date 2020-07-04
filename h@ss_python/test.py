print("数値を判定します。数値を入力してください")
value = int(input())

if value < 0:
    print("値は負です")
elif value == 0:
    print("値は０です")
else:
    print("値は正です")