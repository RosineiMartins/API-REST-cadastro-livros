package com.rosineimartins.bookstoremanager.mapper;

import com.rosineimartins.bookstoremanager.dto.BookDTO;
import com.rosineimartins.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    /**Metodo responsavel para fazer a convenção BookDTO para a classe Entity Book **/
    Book toModel(BookDTO bookDTO);
    /**Metodo responsavel para fazer a convenção da Entity Book para a BookDTO **/
    BookDTO toDTO(Book book);


}
