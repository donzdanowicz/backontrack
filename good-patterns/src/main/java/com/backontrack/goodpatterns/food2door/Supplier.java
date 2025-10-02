package com.backontrack.goodpatterns.food2door;

import java.util.Objects;

public class Supplier {
    private int id;
    private String companyName;
    private String ownerName;
    private String ownerSurname;
    private String address;

    public Supplier(int id, String companyName, String ownerName, String ownerSurname, String address) {
        this.id = id;
        this.companyName = companyName;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return id == supplier.id && Objects.equals(companyName, supplier.companyName) && Objects.equals(ownerName, supplier.ownerName) && Objects.equals(ownerSurname, supplier.ownerSurname) && Objects.equals(address, supplier.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyName, ownerName, ownerSurname, address);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerSurname='" + ownerSurname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
