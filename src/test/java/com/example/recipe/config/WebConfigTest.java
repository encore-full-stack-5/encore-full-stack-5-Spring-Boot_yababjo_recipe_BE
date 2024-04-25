package com.example.recipe.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WebConfigTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCustomInterceptor() throws Exception {
        // 여기서 특정 URL을 호출하고 해당 요청이 예상대로 처리되는지 확인할 수 있습니다.
        mockMvc.perform(get("/api/v1/comments/recipe/1"))
                .andExpect(status().isOk());
    }
}