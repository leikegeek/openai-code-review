package cn.mengxi.middleware.sdk.infrastructure.openai;


import cn.mengxi.middleware.sdk.infrastructure.openai.dto.ChatCompletionRequestDTO;
import cn.mengxi.middleware.sdk.infrastructure.openai.dto.ChatCompletionSyncResponseDTO;

public interface IOpenAI {

    ChatCompletionSyncResponseDTO completions(ChatCompletionRequestDTO requestDTO) throws Exception;

}
