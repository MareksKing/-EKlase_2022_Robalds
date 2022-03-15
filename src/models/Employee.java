package models;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee extends Person {
    private int employeeId;
    private Date contractDate;
    private static Date defContractDate = (Date) new GregorianCalendar(2022, Calendar.MARCH, 24).getTime();
    private String contractNumber;

    private int ids = 300;
    //Get date to work!!!! palicis pie 3.2
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

    /**
     * @param contractDate the contractDate to set
     */
    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
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
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return "Employee [contractDate=" + defContractDate + "]";
    }

}
