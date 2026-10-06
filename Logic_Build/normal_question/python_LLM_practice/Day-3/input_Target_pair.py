
from pypdf import PdfReader;
import imaplib
import tiktoken

tokenizer = tiktoken.get_encoding("gpt2")
reader = PdfReader("../dataset.pdf")
raw_text=""
for page in reader.pages:
    raw_text+=page.extract_text()

enc_text=tokenizer.encode(raw_text)
print("Encode text Len",len(enc_text))
print(enc_text[:50])
print("Row text Len",len(raw_text))


context_size=10
x=enc_text[:context_size]
# Index:    0   1   2   3   4   5   6
# enc_text [10, 20, 30, 40, 50, 60, 70]
#           └─────────────┘
# x       = [10, 20, 30, 40]

y=enc_text[1:context_size+1]
# Index:    0   1   2   3   4   5   6
# enc_text [10, 20, 30, 40, 50, 60, 70]
#               └─────────────┘
# y       =     [20, 30, 40, 50]

print("x =", x)
print("y =", y)

for i in range(1,context_size+1):
    context=enc_text[:i]
    desired=enc_text[i]
    print(context,"Id ---> ",desired)
    print(tokenizer.decode(context))
    
