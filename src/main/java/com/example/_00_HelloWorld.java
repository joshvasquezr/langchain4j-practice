package com.example;

import dev.langchain4j.model.chat.ChatLanguageModel; // import ChatLanguageModel
import dev.langchain4j.model.openai.OpenAiChatModel; // import OpenAiChatModel

import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_4_O_MINI; // declare static LLM model

public class _00_HelloWorld {

    public static void main(String[] args) {

        // instantiate ChatLanguageModel with parametersa & OPENAI_API_KEY
        ChatLanguageModel model = OpenAiChatModel.builder()
                .apiKey(System.getenv("OPENAI_API_KEY"))
                .modelName(GPT_4_O_MINI)
                .build();

        // generates the model response, must add in message / question to receieve response
        String answer = model.generate("Who was Socrates?");

        System.out.println(answer);
    }
}