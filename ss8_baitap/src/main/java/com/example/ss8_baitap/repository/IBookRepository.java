package com.example.ss8_baitap.repository;


import com.example.ss8_baitap.dto.BookDto;
import com.example.ss8_baitap.dto.IBookDetailDto;
import com.example.ss8_baitap.dto.IBookDto;
import com.example.ss8_baitap.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book,Integer> {

    @Query(value = "select * \n" +
            "from book_details bd\n" +
            "join book b on  bd.book_id = b.id_book\n" +
            "join type_book tb on bd.type_id = tb.id_type_book\n" +
            "where tb.name_type like : name", nativeQuery = true)
    List<Book> getBook(@Param(value = "name") String name);

    @Query(value = "select bd.id, bd.date, tb.name_type as nameType, b.code , b.name, b.author\n" +
            "from book_details bd\n" +
            "join book b on  bd.book_id = b.id_book\n" +
            "join type_book tb on bd.type_id = tb.id_type_book", nativeQuery = true)
    List<IBookDetailDto> getIBookDetailDto();

    @Query(value = "select b.name, b.author, b.code, group_concat(tb.name_type) as typeBook \n" +
            "from book_details bd\n" +
            "join book b on  bd.book_id = b.id_book\n" +
            "join type_book tb on bd.type_id = tb.id_type_book\n" +
            "group by b.id_book", nativeQuery = true)
    List<BookDto> getIBookDto();
}
