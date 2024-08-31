package com.example.kartgp.dao;

import com.example.kartgp.entity.Receipt;
import com.example.kartgp.exception.DuplicateReceiptException;
import com.example.kartgp.exception.ReceiptNotFoundException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.sql.SQLException;


public abstract class ReceiptDAO {
    public abstract void createReceipt(Receipt receipt) throws SQLException, IOException, DuplicateReceiptException, ReceiptNotFoundException;

    public abstract Receipt retrieveReceipt(int userId) throws SQLException, ReceiptNotFoundException, CsvValidationException, IOException;

}
