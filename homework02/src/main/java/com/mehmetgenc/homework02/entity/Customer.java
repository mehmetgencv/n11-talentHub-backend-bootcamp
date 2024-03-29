package com.mehmetgenc.homework02.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Creation Date: 20.02.2024
 *
 * @author: mehmetgenc
 */

public class Customer {

    private Integer id;
    private String name;
    private String sector;
    private List<Invoice> invoices;
    private LocalDate registeredDate;

    public Customer(Integer id, String name, String sector) {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.registeredDate = LocalDate.now();
        this.invoices = new ArrayList<>();
    }
    public Customer(Integer id, String name, String sector,LocalDate registeredDate) {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.registeredDate = registeredDate;
        this.invoices = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSector() {
        return sector;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice order) {
        invoices.add(order);
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                ", invoices=" + invoices +
                ", registeredDate=" + registeredDate +
                '}';
    }
}
