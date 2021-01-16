
public class PatientInfo {

    
    // ATTRIBUTES
    private int patientNum;
    private String firstName;
    private String lastName;
    private String allergies;
    private String medicalConditions;
    private String gender;
    private int dateOfBirth;
    private String securityKey;

    // CONSTRUCTORS
    public PatientInfo(int pN, String fN, String lN, String aG, String mC, String G, int dOB, String sK) {
    	patientNum = pN;
        firstName = fN;
    	lastName = lN;
    	allergies = aG;
    	medicalConditions = mC;
        gender = G;
    	dateOfBirth = dOB;
        securityKey = sK;
    }
    
    
    // METHODS
    
    public int getPatientNum(){
        return patientNum;
    }
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public String getAllergies(){
        return allergies;
    }
    
    public String getMedicalConditions(){
        return medicalConditions;
    }
    
    public String getGender(){
        return gender;
    }
    
    public int getDataOfBirth(){
        return dateOfBirth;
    }
    
    public String getSecurityKey(){
        return securityKey;
    }
    
}
