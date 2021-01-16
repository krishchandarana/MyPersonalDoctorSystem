import java.util.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is an EmployeeInfo object.
	public ArrayList<PatientInfo>[] buckets;
	private int numInHashTable;
        String [][] dataTable;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];
                numInHashTable = 0;

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
			
	}

	
	// METHODS
	
	public int getNumInHashTable() {
		return numInHashTable;
	}

	public int calcBucket(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}
        
	// start AddEmployee
	public void addEmployee(PatientInfo thePatient) {
            
		if (thePatient.getPatientNum() > 0);
                    int targetBucket = calcBucket(thePatient.getPatientNum());
                    buckets[targetBucket].add(thePatient);
                    numInHashTable++;
		
	} 
        // end AddEmployee
        
	// start RemoveEmployee
	public PatientInfo removeEmployee(int patientNum) {
            
		int targetBucket = calcBucket(patientNum);
                
		for(int i = 0 ; i < buckets[targetBucket].size(); i++) {
			if (buckets[targetBucket].get(i).getPatientNum() == patientNum) {
                            PatientInfo locatedPatient = buckets[targetBucket].get(i);
                            buckets[targetBucket].remove(i);
                            numInHashTable--;
                            return locatedPatient;
			}
		}
		
		return null;
			
	} 
        // end removeEmployee    
        
        // start searchFromTable
        public PatientInfo searchFromTable(int patientNum){
            
            int targetBucket = calcBucket(patientNum);
                
		for(int i = 0 ; i < buckets[targetBucket].size(); i++) {
			if (buckets[targetBucket].get(i).getPatientNum() == patientNum) {
                            PatientInfo locatedPatient = buckets[targetBucket].get(i);
                            return locatedPatient;
			}
		}
		
		return null;
            
        }
        // end searchFromTable
        
     
        // start displayEmployee
	/*public String[][] displayEmployee() {
				
		// Print the employee numbers for the employees stored in each bucket's ArrayList,
		// starting with bucket 0, then bucket 1, and so on.
                
                if (numInHashTable > 0){
                    dataTable = new String[numInHashTable][5];
                    int q = 0;
                       
                    for (ArrayList<PatientInfo> bucket : buckets){
                        for (int i = 0; i < bucket.size(); i++){
                            PatientInfo thePatient = bucket.get(i);
                            
                            //display specfically for a PTE (All the general attributes plus the specifc ones)
                            if (theEmployee instanceof PTE) {
                                PTE thePTE = (PTE) theEmployee;
                                dataTable[q][0] = Integer.toString(theEmployee.getEmpNum());
                                dataTable[q][1] = "PTE";
                                dataTable[q][2] = theEmployee.getFirstName();
                                dataTable[q][3] = theEmployee.getLastName();
                                dataTable[q][4] = Double.toString(thePTE.calcNetAnnualIncome()); 
                                q++;
                            }
                            
                            //display specfically for a FTE (All the general attributes plus the specifc ones)
                            if (theEmployee instanceof FTE){
                                FTE theFTE = (FTE) theEmployee;
                                dataTable[q][0] = Integer.toString(theEmployee.getEmpNum());
                                dataTable[q][1] = "FTE";
                                dataTable[q][2] = theEmployee.getFirstName();
                                dataTable[q][3] = theEmployee.getLastName();
                                dataTable[q][4] = Double.toString(theFTE.calcNetAnnualIncome());
                                q++;
                            } 
                        }
                    }
                }
                return dataTable;
            }*/
	 
        // end displayEmployee
        
        // start saveFile
        public void saveFile(String theFileLocation){
            try {
                File fileArchive = new File(theFileLocation);
                if (!fileArchive.exists()){ //if there is no file then it creates a new file
                    fileArchive.createNewFile();
                }
                FileWriter fW = new FileWriter(theFileLocation);
                BufferedWriter bW = new BufferedWriter(fW);
                
                for (int p = 0; p < buckets.length; p++){
                    for (int i = 0; i < buckets[p].size(); i++){
                        PatientInfo thePatient = buckets[p].get(i);
                        
                        bW.write(Integer.toString(thePatient.getPatientNum()));
                        bW.write("*");
                        bW.write(thePatient.getFirstName());
                        bW.write("*");
                        bW.write(thePatient.getLastName());
                        bW.write("*");
                        bW.write(thePatient.getAllergies());
                        bW.write("*");
                        bW.write(thePatient.getMedicalConditions());
                        bW.write("*");
                        bW.write(thePatient.getGender());
                        bW.write("*");
                        bW.write(Integer.toString(thePatient.getDataOfBirth()));
                        bW.write("*");
                        bW.write(thePatient.getSecurityKey());
                        
                        bW.newLine();          
                    }
                }
                bW.write("^");
                bW.close();
            }
            
            catch (IOException IOE){
                IOE.printStackTrace();
            }
        }
	// end saveFile
} 
// end MyHashTable
