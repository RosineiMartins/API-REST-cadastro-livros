package com.rosineimartins.bookstoremanager.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AuthorDto {

    private Long id;
    @NotBlank
    @Size(max = 200)
    private String name;
    @NotNull
    @Size(max = 100)
    private Integer age;


}
