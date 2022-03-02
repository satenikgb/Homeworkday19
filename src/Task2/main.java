package Task2;

import Task3.ItCompany;
import Task3.Marketing;
import Task3.SMM;

public class main {
    public static void main(String[] args) {
        Accounting a = new Accounting();
        System.out.println(a.getDepartmentName());
        a.account();
        System.out.println(a.getCountOfEmployers());
        TaxAccounting t = new TaxAccounting();
        t.account();
        TaxAccounting t1 = new FinancialAccount();
        t1.account();
        FinancialAccount f = new FinancialAccount();
        f.account();


    }
}
