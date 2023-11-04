/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.awt.Dialog;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.catrina.iu.FormAccount;

/**
 *
 * @author luisd
 */
public class AccountStatement {

    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transaction> transactions;

    public AccountStatement deserialize(String json) {
        AccountStatement accountStatement = new AccountStatement();

        try {
            accountStatement = new Gson().fromJson(json, AccountStatement.class);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null, 
                    ex,
                    "Algo salio mal!",
                    JOptionPane.ERROR_MESSAGE
            );;

        }
        return accountStatement;
    }

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
