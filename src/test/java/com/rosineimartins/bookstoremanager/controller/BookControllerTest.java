package com.rosineimartins.bookstoremanager.controller;

import com.rosineimartins.bookstoremanager.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {

    private MockMvc mockMvc;
    @Mock
    private BookService bookService;
    @InjectMocks
    private BookController bookController;



    @BeforeEach
    private void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(bookController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver()
                        ).setViewResolvers((viewName, locale) -> new MappingJackson2JsonView()
                        ).build();
    }
    @Test
    void name() {
    }
}
