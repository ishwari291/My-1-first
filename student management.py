students = {}

while true:
  name = input("Name:")
if name.lower() == "exit":
 break

marks =int(input("Marks:"))
students[name] = marks
print(students)
