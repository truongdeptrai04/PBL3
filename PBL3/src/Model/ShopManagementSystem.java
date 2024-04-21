//package PBL3;
//import java.util.*;	
//public class ShopManagementSystem {
//    ArrayList<Product> inventory;
//    ArrayList<Invoice> salesHistory;
//    HashMap<String, Customer> customers;
//    HashMap<String, String> employeeAccounts; 
//    HashMap<String, String> adminAccounts;
//
//    public ShopManagementSystem() {
//        inventory = new ArrayList<>();
//        salesHistory = new ArrayList<>();
//        customers = new HashMap<>();
//        employeeAccounts = new HashMap<>();
//        adminAccounts = new HashMap<>();
//    }
//
//    public boolean login(String username, String password) {
//        if (adminAccounts.containsKey(username) && adminAccounts.get(username).equals(password)) {
//            // Admin login
//            return true;
//        } else if (employeeAccounts.containsKey(username) && employeeAccounts.get(username).equals(password)) {
//            // Employee login
//            return true;
//        }
//        return false;
//    }
//
//    public void addInventoryItem(Product item) {
//        inventory.add(item);
//    }
//
//    public void removeInventoryItem(Product item) {
//        inventory.remove(item);
//    }
//
//    public void processSale(Invoice transaction) {
//        salesHistory.add(transaction);
//        for (Product item : transaction.items) {
//            item.quantity -= 1; 
//        }
//    }
//
//    public Invoice findTransactionByInvoiceNumber(int invoiceNumber) {
//        for (Invoice transaction : salesHistory) {
//            if (transaction.invoiceID == invoiceNumber) {
//                return transaction;
//            }
//        }
//        return null;
//    }
//
//    public void deleteTransactionByInvoiceNumber(int invoiceNumber) {
//        Invoice transactionToRemove = null;
//        for (Invoice transaction : salesHistory) {
//            if (transaction.invoiceID == invoiceNumber) {
//                transactionToRemove = transaction;
//                break;
//            }
//        }
//        if (transactionToRemove != null) {
//            salesHistory.remove(transactionToRemove);
//
//            for (Product item : transactionToRemove.items) {
//                item.quantity += 1; 
//            }
//        }
//    }
//
//    public void addCustomer(Customer customer) {
//        customers.put(customer.phoneNumber, customer);
//    }
//
//    public Customer findCustomerByPhoneNumber(String phoneNumber) {
//        return customers.get(phoneNumber);
//    }
//
//    public void deleteCustomerByPhoneNumber(String phoneNumber) {
//        customers.remove(phoneNumber);
//    }
//
//}
package Model;

