package Task2;

public class FinancialAccount extends TaxAccounting {
    private int countOfEmployers;
    private String departmentName;


    @Override
    public void account() {
        System.out.println("Calculate salary of Employers");
    }
}
