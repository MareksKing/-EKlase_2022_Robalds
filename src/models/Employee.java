package models;

import java.sql.Date;
import java.util.Calendar;
import java.util.TimeZone;

public class Employee extends Person {
    private int employeeId;
    private long laiks = 1648072800000L;
    private Date defContractDate = new Date(laiks);
    private String contractNumber;
    private Date contractDate = null;

    private static int ids = 300;
    
    
    public Employee() {
        super();
        setEmployeeId();
        setContractDate(defContractDate);
        setContractNumber();
    }
    
    public Employee(String vards, String uzvards, String personasKods, int year, int month, int day) {
        super(vards, uzvards, personasKods);
        setEmployeeId();
        setContractDate(year, month, day);
        setContractNumber();
    }
    /**
     * @return int return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId() {
        this.employeeId = ids;
        ids++;
    }

    /**
     * @return LocalDate return the contractDate
     */
    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate){
        this.contractDate = contractDate;
    }
    /**
     * @param contractDate the contractDate to set
     */
    public void setContractDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Riga"));
        cal.set(year, month - 1, day);
        long laiks = cal.getTimeInMillis();
        Date contractDate = new Date(laiks);
        if(contractDate.after(defContractDate)){
            this.contractDate = contractDate;
        } else {
            this.contractDate = defContractDate;
        }
    }
    
    

    /**
     * @return String return the contractNumber
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * @param contractNumber the contractNumber to set
     */
    public void setContractNumber() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Riga"));
        cal.setTime(contractDate);
        int gads = cal.get(Calendar.YEAR);
        this.contractNumber = gads + "_" + employeeId + "_" +  super.getVards().charAt(0) + "_" +  super.getUzvards().charAt(0);
    }

    @Override
    public String toString() {
        return "Employee [contractDate=" + getContractDate() + ", contractNumber=" + getContractNumber() + ", employeeId=" + employeeId + "]";
    }
    

}
