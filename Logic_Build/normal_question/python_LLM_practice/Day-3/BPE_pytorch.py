import torch
from torch.utils.data import Dataset, DataLoader
import tiktoken
from pypdf import PdfReader


class GPTDatasetV1(Dataset):

    def __init__(self, text, tokenizer, max_length, stride):

        self.input_ids = []
        self.target_ids = []

        token_ids = tokenizer.encode(
            text,
            allowed_special={"<|endoftext|>"}
        )

        for i in range(0, len(token_ids) - max_length, stride):

            input_chunk = token_ids[i:i + max_length]

            target_chunk = token_ids[i + 1:i + max_length + 1]

            self.input_ids.append(torch.tensor(input_chunk))
            self.target_ids.append(torch.tensor(target_chunk))

    def __len__(self):
        return len(self.input_ids)

    def __getitem__(self, idx):
        return self.input_ids[idx], self.target_ids[idx]


def create_dataloader(
    txt,
    batch_size=4,
    max_length=256,
    stride=128,
    shuffle=True,
    drop_last=True,
    num_workers=0
):

    tokenizer = tiktoken.get_encoding("gpt2")

    dataset = GPTDatasetV1(
        txt,
        tokenizer,
        max_length,
        stride
    )

    dataloader = DataLoader(
        dataset,
        batch_size=batch_size,
        shuffle=shuffle,
        drop_last=drop_last,
        num_workers=num_workers
    )

    return dataloader


reader = PdfReader("../dataset.pdf")

raw_text = ""

for page in reader.pages:
    raw_text += page.extract_text()

tokenizer = tiktoken.get_encoding("gpt2")
dataLoader = create_dataloader(
    raw_text,
    batch_size=8,
    max_length=4,
    stride=4,
    shuffle=False

)

data_iter = iter(dataLoader)

first_batch = next(data_iter)

print(first_batch)


input_ids, target_ids = first_batch

print("Input:", tokenizer.decode(input_ids[0].tolist()))
print("Target:", tokenizer.decode(target_ids[0].tolist()))