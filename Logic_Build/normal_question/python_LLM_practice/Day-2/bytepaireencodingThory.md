# ============================================================
# BYTE PAIR ENCODING (BPE) - QUICK REVISION
# ============================================================
#
# What is BPE?
# ------------------------------------------------------------
# BPE = Byte Pair Encoding.
#
# It is a tokenization algorithm used to create subword tokens.
# Instead of storing every complete word in the vocabulary,
# BPE can break uncommon words into smaller pieces.
#
#
# Why do we need BPE?
# ------------------------------------------------------------
# Consider these words:
#
#     play
#     playing
#     played
#     player
#
# Instead of storing every word separately, BPE can learn
# reusable pieces such as:
#
#     play
#     ing
#     ed
#     er
#
# So:
#
#     playing -> play + ing
#     played  -> play + ed
#     player  -> play + er
#
#
# Main idea
# ------------------------------------------------------------
# BPE starts with small units and repeatedly merges the most
# frequently occurring pair.
#
# Example:
#
#     low
#     lower
#     lowest
#
# Initially:
#
#     l o w
#     l o w e r
#     l o w e s t
#
# If "l" + "o" occurs frequently:
#
#     l o -> lo
#
# Then:
#
#     lo w
#     lo w e r
#     lo w e s t
#
# If "lo" + "w" occurs frequently:
#
#     lo + w -> low
#
# Then:
#
#     low
#     low e r
#     low e s t
#
#
# BPE training process
# ------------------------------------------------------------
#
# 1. Start with small units.
#
# 2. Count adjacent pairs.
#
# 3. Find the most frequent pair.
#
# 4. Merge that pair into one token.
#
# 5. Repeat the process.
#
# 6. Stop when the required vocabulary size is reached.
#
#
# Example:
#
#     Text:
#     "low lower lowest"
#
# Start:
#
#     l o w
#     l o w e r
#     l o w e s t
#
# Find frequent pair:
#
#     l + o
#
# Merge:
#
#     lo
#
# Continue merging frequent pairs.
#
#
# Important terms
# ------------------------------------------------------------
#
# Token
#   A small piece of text used by the tokenizer.
#
# Vocabulary
#   Collection of all tokens known by the tokenizer.
#
# Token ID
#   Integer assigned to each token.
#
# Example:
#
#     "hello" -> 1256
#     "world" -> 995
#
#
# Special tokens
# ------------------------------------------------------------
#
# Some tokenizers use special tokens to represent special
# information.
#
# Example:
#
#     <|endoftext|>
#     <|unk|>
#
# <|endoftext|>
#   Represents the end of a text/document.
#
# <|unk|>
#   Represents an unknown token.
#
#
# BPE vs normal word tokenization
# ------------------------------------------------------------
#
# Word tokenization:
#
#     "playing" -> ["playing"]
#
# BPE/subword tokenization can produce:
#
#     "playing" -> ["play", "ing"]
#
# Advantage:
# Rare or unknown words can often be represented using
# smaller known pieces instead of completely becoming <|unk|>.
#
#
# BPE and GPT-2
# ------------------------------------------------------------
#
# GPT-2 uses a BPE-style tokenizer.
#
# With tiktoken:
#
#     import tiktoken
#
#     tokenizer = tiktoken.get_encoding("gpt2")
#
#     text = "Hello, how are you?"
#
#     tokens = tokenizer.encode(text)
#
#     print(tokens)
#
#     decoded = tokenizer.decode(tokens)
#
#     print(decoded)
#
#
# IMPORTANT:
# ------------------------------------------------------------
# tiktoken already contains a trained tokenizer.
#
# We normally use it like:
#
#     tokens = tokenizer.encode(text)
#
# We are NOT training BPE ourselves here.
#
# Our earlier SimpleTocken class was a simple educational
# tokenizer. It used a vocabulary created from our dataset.
#
#
# SimpleTocken vs BPE
# ------------------------------------------------------------
#
# SimpleTocken:
#
#     Text
#       ↓
#     split words/punctuation
#       ↓
#     vocabulary lookup
#       ↓
#     token IDs
#
#
# BPE:
#
#     Text
#       ↓
#     break into smaller units
#       ↓
#     repeatedly merge frequent pairs
#       ↓
#     learned subword vocabulary
#       ↓
#     token IDs
#
#
# ============================================================
# QUICK MEMORY:
#
# BPE = repeatedly MERGE the most frequent adjacent pair.
#
# Example:
#
#     a b c
#     ↓
#     ab c
#     ↓
#     abc
#
# Most important steps:
#
#     Count pairs
#          ↓
#     Find most frequent pair
#          ↓
#     Merge pair
#          ↓
#     Repeat
#
# ============================================================
bytepaireencoding.py
│
├── BPE THEORY / NOTES       ← put the comments above here
│
├── import tiktoken
│
├── create tokenizer
│
├── sample text
│
├── encode
│
├── print token IDs
│
└── decode