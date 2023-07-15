import re

url = "file://localhost:4040/zip_file" 
file_pattern = r"\/([\w\_\.]+)$" 
hostname_pattern = r"\/\/([\w\.]+)" 
port_pattern = r"\:(\d+)\/"
match_file = re.search(file_pattern, url) 
match_hostname = re.search(hostname_pattern, url) 
match_port = re.search(port_pattern, url)
file = match_file.group(1) 
hostname = match_hostname.group(1) 
port = match_port.group(1)
 
print("File:", file) 
print("Hostname:", hostname) 
print("Port:", port)
