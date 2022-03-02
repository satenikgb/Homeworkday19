package Task3;

import Task2.Accounting;

public class main {
    public static void main(String[] args) {
        ItCompany i = new ItCompany(24, "ITAAA");
        System.out.println(i.countOfEmployers);
        System.out.println(i.departmentName);
        i.account();
        Marketing m = new Marketing();
        System.out.println(m.departmentName);
        m.marketing();
        m.account();
        SEO s = new SEO();
        s.account();
        s.marketing();
        System.out.println(s.departmentName);
        SMM sm = new SMM();
        sm.marketing();
        sm.account();

    }
}
