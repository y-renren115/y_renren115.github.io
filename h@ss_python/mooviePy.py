#sisaku
print("レビュー数:0")
print("[0]レビューを書く")
print("[1]レビューを読む")
print("[2]アプリを終了する")
num1 = int(input())
post = {}
line = "\n_______________________________________"

if num1 == 0:
print("ジャンル、タイトル、レビューを順に入力してください")
print("タイトルを入力してください")
post["genre"] = input()
print("ジャンルを入力してください")
post["title"] = input()
print("レビューを入力してください")
post["review"] = input()

print("ジャンル:" + post["genre"])
print(line)
print("タイトル:" + post["title"])
print(line)
print("レビュー:" + post["review"]) 

elif num1 == 1
