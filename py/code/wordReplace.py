paragraph = '''
Your name is NAME
and
Your age is AGE '''

name = input("Enter your Name\n")
age = input("Enter your Age\n")

paragraph = paragraph.replace("NAME", name)
paragraph = paragraph.replace("AGE", age)

print(paragraph)