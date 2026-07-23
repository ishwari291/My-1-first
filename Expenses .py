expenses = []

while True:
    amount = input("Enter amount (or quit): ")

    if amount == "quit":
        break

    expenses.append(float(amount))

print("Total Expense:", sum(expenses))
