package Task2;

public class TaxAccounting extends Accounting {
    private int countOfEmployers;
    private String departmentName;

    @Override
    public void account() {
        System.out.println("Calculate tax of company");
    }
}
