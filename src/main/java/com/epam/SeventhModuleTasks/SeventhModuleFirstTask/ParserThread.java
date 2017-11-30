package com.epam.SeventhModuleTasks.SeventhModuleFirstTask;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.math.BigDecimal;

public class ParserThread extends Thread {

    private int from;
    private int to;
    private NodeList transactionNodes;

    public ParserThread(String name, int from, int to, NodeList transactionNodes) {
        super(name);
        this.from = from;
        this.to = to;
        this.transactionNodes = transactionNodes;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            Node node = transactionNodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                int transactionId = Integer.valueOf(element.getAttribute("id"));
                int payerId = Integer.valueOf(element.getElementsByTagName("payerId").item(0).getTextContent());
                int payeeId = Integer.valueOf(element.getElementsByTagName("payeeId").item(0).getTextContent());
                Double amount = Double.valueOf(element.getElementsByTagName("amount").item(0).getTextContent());

                // TODO find why concurrent map is working wrong
                SeventhModuleFirstTask.concurrentBankAccounts.replace(payerId,
                        SeventhModuleFirstTask.concurrentBankAccounts.get(payerId) - amount );
                SeventhModuleFirstTask.concurrentBankAccounts.put(payeeId,
                        SeventhModuleFirstTask.concurrentBankAccounts.get(payeeId) + amount);

                synchronized (SeventhModuleFirstTask.bankAccounts.get(payerId)) {
                    SeventhModuleFirstTask.bankAccounts.put(payerId,
                            SeventhModuleFirstTask.bankAccounts.get(payerId) - amount );
                }
                synchronized (SeventhModuleFirstTask.bankAccounts.get(payeeId)) {
                    SeventhModuleFirstTask.bankAccounts.put(payeeId,
                            SeventhModuleFirstTask.bankAccounts.get(payeeId) + amount);
                }

                Transaction transaction = new Transaction(transactionId, payerId, payeeId, amount);
                SeventhModuleFirstTask.addTransaction(transaction);
            }
        }
        System.out.println(getName() + " done!");
    }
}
