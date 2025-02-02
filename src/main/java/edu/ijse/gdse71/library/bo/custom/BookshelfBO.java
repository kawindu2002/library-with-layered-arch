package edu.ijse.gdse71.library.bo.custom;

import edu.ijse.gdse71.library.dto.BookshelfDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BookshelfBO {

    static String getNextBookshelfId() throws SQLException {
        return null;
    }
    boolean save(BookshelfDTO dto) throws SQLException;
    boolean delete(String id) throws SQLException;
    boolean update(BookshelfDTO dto) throws SQLException;
    ArrayList<BookshelfDTO> getAll() throws SQLException;
    ArrayList<String> getAllIds() throws SQLException;
    BookshelfDTO findById(String selectedId) throws SQLException;
}

