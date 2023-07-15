import re

# Entering email address
email = input("Enter an email address: ")

# Defining a regular expression pattern to extract user name and company name
pattern = r"^(\w+)@(\w+)\.com$"

# Matching the pattern against the email address 
match = re.match(pattern, email)

# Checking if the pattern matched successfully 
if match:
# Extracting the user name and company name from the match object
    user_name = match.group(1) 
    company_name = match.group(2)

    # Printing the user name and company name 
    print("User name:", user_name) 
    print("Company name:", company_name)
else:
    print("Invalid email address!")