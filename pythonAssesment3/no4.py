# import re

# # Defining a regular expression pattern for password validation
# pattern = r"^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$#@])[A-Za- z\d$#@]{6,12}$"

# # Taking comma separated passwords as input
# passwords = input("Enter comma separated passwords: ")

# # Splitting the passwords by comma and iterating over them 
# for password in passwords.split(","):
#     password = password.strip() # Removing leading/trailing whitespaces
#     if re.match(pattern, password):
#         print(password, end=",") # Printing valid passwords separated by comma

# print() # Printing a new line at the end



import re

# Function to validate password
def check_password(password):
    if 6 <= len(password) <= 12:
        if re.search("[a-z]", password) and re.search("[0-9]", password) and re.search("[A-Z]", password) and re.search("[$#@]", password):
            return True
    # Return false if password does not follow rules
    return False

# Entaring password separated by comma
passwords = input("Enter comma separated passwords: ")
passwords_list = passwords.split(",")

valid_passwords = []
for password in passwords_list:
    if check_password(password):
        valid_passwords.append(password)

# Printing the password
print(",".join(valid_passwords) + ",")
