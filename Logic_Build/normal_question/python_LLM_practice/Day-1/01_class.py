


## This work only for .txt format 
# with open ('dataset.txt','r',encoding='utf-8') as f :
#     raw_text=f.read()
# print("Total number of character: ",len(raw_text))
# print(raw_text[:99])


## Step-1 :- Extract Text From Data Set
from pypdf import PdfReader;

reader = PdfReader("dataset.pdf")
raw_text=""
for page in reader.pages:
    raw_text+=page.extract_text()

# print("Total number of character: ",len(raw_text))
# print(raw_text[:99])


## Step-2 Remove Space and proper include (',.,[],(),-,\,/,!,@,?, etc) special charctor without space
import re


result = re.split(r'([,.:;?!()\[\]{}\'"@#$/\\-]|\s+)', raw_text)

result = [item for item in result if item.strip()]

#print("Final Result ", result)
print(len(result))


#Sort and only Unique words
all_words=sorted(set(result))
all_words.extend(["<|endoftext|>","<|unk|>"])
print("After Sort: ",len(all_words))


vocab={token:inateger for inateger,token in enumerate(all_words)}

for i, item in enumerate (vocab.items()):
    if i >= 500:
        print(item)

    if i == 550:
        break



class SimpleTocken:
    def __init__(self,vocab):
        self.str_to_int=vocab
        self.int_to_str={i:s for s,i in vocab.items()}

    def encode(self, text):

        text = text.replace("<|endoftext|>", " <|endoftext|> ")

        preprocessed = re.split(r'([,.:;?!()\[\]{}\'"@#$/\\-]|\s+)',text)

        preprocessed = [item.strip() for item in preprocessed if item.strip()]

        preprocessed = [item if item in self.str_to_int else "<|unk|>" for item in preprocessed ]

        ids = [self.str_to_int[s] for s in preprocessed]

        return ids
    
    def decode(self, ids):
        text = " ".join([self.int_to_str[i] for i in ids])
        text = re.sub(r'\s+([,.!?;:\'"])', r'\1', text)
        return text


tokenized=SimpleTocken(vocab)
text1 = "Hello, Do you like tea?"
text2="In The sunlit terraces of the place."
text="<|endoftext|>".join((text1,text2))

print(text)

ids=tokenized.encode(text)
result=tokenized.decode(ids)
print(ids)
print(result)
print(tokenized.int_to_str[6494])
print(tokenized.int_to_str[6495])

