package Task2;


import Task3.ItCompany;

public class Accounting extends ItCompany {
    private int countOfEmployers;
    private String departmentName;

    public Accounting() {
        super(10, "ITSS");
    }

    public void account() {
        System.out.println("Accounting");
    }
}
