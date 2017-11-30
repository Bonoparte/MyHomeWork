package com.epam.SeventhModuleTasks.SeventhModuleFirstTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SeventhModuleFirstTask {

    private static final List<Transaction> transactions = new ArrayList<>();
    static Map<Integer,Double> bankAccounts = new HashMap<>();
    static ConcurrentHashMap<Integer,Double> concurrentBankAccounts = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        bankAccounts.put(0,50.0);
        bankAccounts.put(1,50.0);
        bankAccounts.put(2,50.0);
        bankAccounts.put(3,50.0);
        bankAccounts.put(4,50.0);
        concurrentBankAccounts.put(0,50.0);
        concurrentBankAccounts.put(1,50.0);
        concurrentBankAccounts.put(2,50.0);
        concurrentBankAccounts.put(3,50.0);
        concurrentBankAccounts.put(4,50.0);

        try {
            File XMLFile = new File("transactions.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(XMLFile);
            NodeList transactionNodes = document.getElementsByTagName("transaction");
            System.out.printf("Number of nodes: %d\n", transactionNodes.getLength());
            int to = transactionNodes.getLength() / 4;
            Thread thread1 = new ParserThread("Thread1", 0, to - 1, transactionNodes);
            Thread thread2 = new ParserThread("Thread2", to, 2 * to - 1, transactionNodes);
            Thread thread3 = new ParserThread("Thread3", 2 * to, 3 * to - 1, transactionNodes);
            Thread thread4 = new ParserThread("Thread4", 3 * to, 4 * to - 1, transactionNodes);
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (SAXException | IOException | ParserConfigurationException | InterruptedException e) {
            e.printStackTrace();
        }
        Collections.sort(transactions, Comparator.comparingInt(Transaction::getId));
        transactions.forEach(System.out::println);
        System.out.println(bankAccounts);
        System.out.println(concurrentBankAccounts);
//        generateSampleXML();

    }

    public static void addTransaction(Transaction transaction) {
        synchronized (transactions) {
            transactions.add(transaction);
        }
    }


//    /**
//     * This method creating xml-file with transactions
//     */
//    private static void generateSampleXML() {
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = null;
//        try {
//            builder = factory.newDocumentBuilder();
//            Document document = builder.newDocument();
//
//            Element transactions = document.createElement("transactions");
//            Random random = new Random();
//            for (int i = 0; i < 8; i++) {
//                Element transaction = document.createElement("transaction");
//
//                Element payerId = document.createElement("payerId");
//                Element payeeId = document.createElement("payeeId");
//                Element amount = document.createElement("amount");
//
//                transaction.setAttribute("id", String.valueOf(i));
//                payerId.setTextContent(String.valueOf(random.nextInt(5)));
//                payeeId.setTextContent(String.valueOf(random.nextInt(5)));
//                amount.setTextContent(String.valueOf(((double)Math.round(random.nextDouble()*1000))/100));
//
//                transaction.appendChild(payerId);
//                transaction.appendChild(payeeId);
//                transaction.appendChild(amount);
//
//                transactions.appendChild(transaction);
//            }
//
//            document.appendChild(transactions);
//            TransformerFactory transformerFactory = TransformerFactory.newInstance();
//            Transformer transformer = transformerFactory.newTransformer();
//            DOMSource source = new DOMSource(document);
//            StreamResult result = new StreamResult(new FileWriter("transactions.xml"));
//            transformer.transform(source, result);
//        } catch (ParserConfigurationException | TransformerException | IOException e) {
//            e.printStackTrace();
//        }
//    }
}
