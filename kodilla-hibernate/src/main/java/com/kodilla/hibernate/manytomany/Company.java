package com.kodilla.hibernate.manytomany;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQueries({
        @NamedNativeQuery(name = "Company.retrieveCompaniesWithNamesStartingWith",
                query = "SELECT * FROM COMPANIES WHERE SUBSTRING(COMPANY_NAME, 1, 3) = :LETTERS",
                resultClass = Company.class),
        @NamedNativeQuery(name = "Company.retrieveCompaniesWithNamesContainingPhrase",
                query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT('%',:PHRASE,'%')",
                resultClass = Company.class)
})

@Table(name = "COMPANIES")
@Entity
public class Company {
    private int id;
    private String name;
    List<Employee> employees = new ArrayList<>();

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
