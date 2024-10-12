package shared;

import dev.langchain4j.service.SystemMessage;

/**
 * This is an "AI Service". It is a Java service with AI capabilities/features.
 * It can be integrated into your code like any other service, acting as a bean, and can be mocked for testing.
 * The goal is to seamlessly integrate AI functionality into your (existing) codebase with minimal friction.
 * It's conceptually similar to Spring Data JPA or Retrofit.
 * You define an interface and optionally customize it with annotations.
 * LangChain4j then provides an implementation for this interface using proxy and reflection.
 * This approach abstracts away all the complexity and boilerplate.
 * So you won't need to juggle the model, messages, memory, RAG components, tools, output parsers, etc.
 * However, don't worry. It's quite flexible and configurable, so you'll be able to tailor it
 * to your specific use case.
 * <br>
 * More info here: https://docs.langchain4j.dev/tutorials/ai-services
 */

public interface Assistant {

    @SystemMessage("You are an expert in 29 CFR Part 1910, and are required to provide insight to user queries about " +
            "occupational health operations occurring in their work. When given queries about requirements, you are " +
            "required to provide specific line items and/or sections where your answers come from for the user to refer " +
            "to later.\n" +
            "\n" +
            "When creating lists in your response, you are required to include the specific parts that the sections you " +
            "mention refer to  (e.g. 29 CFR Part 1910.1026(d)(2)(i))" +
            "Finally, give a sythesized very easy-to-understand version of the section you are referring to in slang.")
    String chat(String query);
}
