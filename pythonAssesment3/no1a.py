import re

url = "https://www.mit.edu" 
protocol_pattern = r"^(\w+):\/\/" 
hostname_pattern = r"\/\/([\w\.]+)"
match_protocol = re.search(protocol_pattern, url) 
match_hostname = re.search(hostname_pattern, url) 
protocol = match_protocol.group(1)
hostname = match_hostname.group(1)
print("Protocol:", protocol) 
print("Hostname:", hostname)
