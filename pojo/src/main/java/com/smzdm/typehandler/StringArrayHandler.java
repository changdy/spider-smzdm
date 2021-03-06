package com.smzdm.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;

/**
 * Created by Changdy on 2018/3/7.
 */
public class StringArrayHandler extends BaseTypeHandler<String[]> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String[] parameter, JdbcType jdbcType) throws SQLException {
        Connection conn = ps.getConnection();
        Array array = conn.createArrayOf("varchar", parameter);
        ps.setArray(i, array);
    }

    @Override
    public String[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return convertToArray(rs.getArray(columnName));
    }

    @Override
    public String[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return convertToArray(rs.getArray(columnIndex));
    }

    @Override
    public String[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return convertToArray(cs.getArray(columnIndex));
    }

    private String[] convertToArray(Array array) throws SQLException {
        if (array != null) {
            Object objectArr = array.getArray();
            if (objectArr instanceof String[]) {
                return (String[]) objectArr;
            }
        }
        return null;
    }
}
