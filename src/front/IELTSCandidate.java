package front;

public class IELTSCandidate extends User {
    private String testType;
    private String testDate;
    private String testCity;

    public IELTSCandidate(String firstName, String lastName, String dob, String passport, String email, String phone,
                          String testType, String testDate, String testCity) {
        super(firstName, lastName, dob, passport, email, phone);
        this.testType = testType;
        this.testDate = testDate;
        this.testCity = testCity;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTestCity() {
        return testCity;
    }

    public void setTestCity(String testCity) {
        this.testCity = testCity;
    }
}

