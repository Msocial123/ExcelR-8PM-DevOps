# Function to add two numbers
def add_numbers(num1, num2):
    return num1 + num2

# Input numbers from the user
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))

# Call the add_numbers function and display the result
result = add_numbers(num1, num2)
print("The sum of", num1, "and", num2, "is:", result)
