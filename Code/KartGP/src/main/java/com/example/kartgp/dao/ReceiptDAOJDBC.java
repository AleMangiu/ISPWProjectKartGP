package com.example.kartgp.dao;

import com.example.kartgp.database.DbConnection;
import com.example.kartgp.database.Queries;
import com.example.kartgp.entity.Receipt;
import com.example.kartgp.exception.ReceiptNotFoundException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReceiptDAOJDBC extends ReceiptDAO {
    private final Logger logger = Logger.getLogger(ReceiptDAOJDBC.class.getName());

    @Override
    public void createReceipt(Receipt receipt) throws SQLException, ReceiptNotFoundException {
        Connection conn = DbConnection.getConnection();
        try (

                PreparedStatement insertStmt = conn.prepareStatement(
                        Queries.INSERT_RECEIPT,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY)
        ) {

            insertStmt.setDate(1, java.sql.Date.valueOf(receipt.getDate()));
            insertStmt.setInt(2, receipt.getIdDriverEntity());
            insertStmt.setInt(3, receipt.getIdTournamentEntity());
            int result = insertStmt.executeUpdate();

            if (result == 1) {
                logger.log(Level.INFO, "Receipt inserted");
            } else {
                throw new ReceiptNotFoundException("Error creating receipt");
            }
        }
    }


    @Override
    public Receipt retrieveReceipt(int userId) throws ReceiptNotFoundException, SQLException {
        return new Receipt();
    }
}

