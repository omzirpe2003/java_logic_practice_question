


# ==============================
# BPE (Byte Pair Encoding)
# ==============================
#
# BPE is a tokenization algorithm.
#
# Main idea:
# 1. Start with small characters/tokens.
# 2. Count adjacent pairs.
# 3. Find the most frequent pair.
# 4. Merge that pair.
# 5. Repeat until the vocabulary size is reached.
#
# Example:
#   l o w
#   ↓
#   lo w
#   ↓
#   low
#
# BPE helps handle rare/unknown words by
# representing them using smaller subword tokens.
#
# tiktoken provides an already-trained tokenizer.
#
# Example:
# tokenizer = tiktoken.get_encoding("gpt2")
# tokens = tokenizer.encode("Hello world")
# decoded = tokenizer.decode(tokens)
# ==============================

import imaplib
import tiktoken

tokenizer = tiktoken.get_encoding("gpt2")

text = "Hello, my name is Om. <|endoftext|> I am learning how tokenization works in large language models."

tokens=tokenizer.encode(text,allowed_special={"<|endoftext|>"})

print("Text:", text)
print("Tokens:", tokens)
print("Number of tokens:", len(tokens))

 ## This handel out of voablery words