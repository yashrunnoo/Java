# def freq_of_elements(s: str): 
#     l = []
#     f_map = {}
#     l = s.split(' ')

#     for i in l:
#         if i in f_map: 
#             f_map[i] += 1
#         else:
#             f_map[i] = 1 
#     return f_map

# def main():
#     s = 'New to Python or choosing between Python 2 and Python 3? Read Python 2 or Python 3'
#     print(freq_of_elements(s))


# if __name__== 'main': 
#     main()



from collections import defaultdict

word_freq = defaultdict(int)

# Read input from console
input_str = input("Enter input string: ")

# Split input string into words
words = input_str.split()

# Count frequency of each word
for word in words:
    word_freq[word] += 1

# Sort keys alphanumerically
sorted_keys = sorted(word_freq.keys())

# Print frequency of each word
for key in sorted_keys:
    print(f"{key}: {word_freq[key]}")
