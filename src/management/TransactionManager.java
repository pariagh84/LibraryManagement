package management;

import datastructures.lists.CustomLinkedList;
import library.Transaction;

import java.util.Date;

public class TransactionManager {
    private final CustomLinkedList<Transaction> transactions;

    public TransactionManager() {
        transactions = new CustomLinkedList<>();
    }

    public Transaction addTransaction(String bookTitle, String memberName, String type) {
        Transaction transaction = new Transaction(
                "TXN-" + new Date().getTime(),
                bookTitle,
                memberName,
                type
        );
        transactions.add(transaction);
        return transaction;
    }

    public Transaction getTransactionByIndex(int index) {
        return (Transaction) transactions.get(index);
    }
}
