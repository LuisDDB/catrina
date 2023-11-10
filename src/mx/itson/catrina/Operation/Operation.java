/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.Operation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.catrina.entities.Transaction;

/**
 *
 * @author luisd
 */
public class Operation {

    /**
     * Este metodo ordena una lista de transaction por la fecha que
     *
     * @param transaction es una lista de tipo Transaction
     * @param size es el tamaño de la lista
     * @return un List de tipo Transaction ordenada por fecha
     */
    public List<Transaction> bubblesort(List<Transaction> transaction, int size) {

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (transaction.get(j).getDate().after(
                        transaction.get(j + 1).getDate())) {

                    Transaction temp = transaction.get(j);
                    transaction.set(j, transaction.get(j + 1));
                    transaction.set(j + 1, temp);

                }
            }
        }
        return transaction;
    }

    /**
     * Este metodo devuelve las transacciones que se hicieron en cierto mes
     *
     * @param transaction la lista de donde se buscara donde esten el mes
     * @param month el mes que se devolveran
     * @return una lista de tipo Transacion
     */
    public List<Transaction> byMonth(List<Transaction> transaction, int month) {
        List<Transaction> transactionByMonth = new ArrayList<>();
        if (month == 12) {
            return transaction;
        } else {
            for (Transaction t : transaction) {

                if (t.getDate().getMonth() == month) {
                    transactionByMonth.add(t);
                }
            }
            return transactionByMonth;
        }
    }

}
