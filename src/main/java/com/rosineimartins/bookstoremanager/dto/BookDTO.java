package com.rosineimartins.bookstoremanager.dto;

import com.rosineimartins.bookstoremanager.entity.Author;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {

    private Long id;
    @NotBlank
    @Size(max = 200)
    private String name;
    @NotNull
    @Size(max = 200)
    private Integer pages;
    @NotNull
    @Size(max = 200)
    private Integer chapter;
    @Valid
    @NotBlank
    private Author author;
}
