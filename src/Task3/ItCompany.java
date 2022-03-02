package Task3;

public class ItCompany {
    protected int countOfEmployers;
    protected String departmentName;

    public ItCompany() {

    }

    public ItCompany(int countOfEmployers,
                     String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }


    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void account() {
        System.out.println("It Company");
    }
}
