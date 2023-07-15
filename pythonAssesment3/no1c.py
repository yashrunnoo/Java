import re

url = "http://www.example.com/index.html" 
path_pattern = r"\/\/([\w\.]+)(\/.*)" 
match_path = re.search(path_pattern, url) 
hostname = match_path.group(1)
path = match_path.group(2) 
path_elements = path.split("/") 
print("Hostname:", hostname) 
print("Path elements:", path_elements)