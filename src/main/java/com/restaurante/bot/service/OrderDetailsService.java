package com.restaurante.bot.service;

import com.restaurante.bot.dto.OrderDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class OrderDetailsService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public OrderDetailsService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<OrderDetailsDTO> getOrderDetails(Long orderId) {
        // Consulta SQL
        String query = "SELECT co.order_id, p.name AS product_name, op.quantity, rt.table_number, co.total, p.price AS unit_price, rt.status AS table_status, co.order_status " +
                "FROM customerorder co " +
                "JOIN order_product op ON co.order_id = op.order_id " +
                "JOIN product p ON op.product_id = p.product_id " +
                "JOIN restauranttable rt ON co.table_id = rt.table_id " +
                "WHERE co.order_id = ?";

        // Ejecución de la consulta y mapeo del resultado
        List<OrderDetailsDTO> orderDetails = jdbcTemplate.query(query, new Object[]{orderId}, new RowMapper<OrderDetailsDTO>() {
            @Override
            public OrderDetailsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new OrderDetailsDTO(
                        rs.getLong("order_id"),
                        rs.getString("product_name"),
                        rs.getInt("quantity"),
                        rs.getInt("table_number"),
                        rs.getBigDecimal("total"),
                        rs.getBigDecimal("unit_price"),
                        rs.getString("table_status"),
                        rs.getString("order_status")
                );
            }
        });

        return orderDetails;
    }
}
