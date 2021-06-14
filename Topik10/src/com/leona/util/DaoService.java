package com.leona.util;
/**
 * @author Leona Rose
 */

import java.util.List;
import java.sql.SQLException;

public interface DaoService<T>{
    List<T> fetchAll() throws SQLException, ClassNotFoundException;

    int addData(T t) throws SQLException, ClassNotFoundException;

    int updateData(T t) throws SQLException, ClassNotFoundException;

    int deleteData(T t) throws SQLException, ClassNotFoundException;
}
