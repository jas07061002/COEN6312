import java.util.Scanner;
import java.util.*;

public class SearchPatient {
    public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hospital Management System");
		System.out.println();
		System.out.println("Please enter the username");
		String userName = sc.next();
		System.out.println("Please enter the password");
		String password = sc.next();
		ArrayList<Patient> PatientData = createPatientList();
		
		System.out.println("Please input the patient Id - Available options are 123, 526, 876, 356 as samples");
		String patientID_Input = sc.next();
		
		Boolean patientfound = false;
		for(Patient pd : PatientData){
			if(pd.patientID.equals(patientID_Input)){
				
				System.out.println("Below is Patient Information");
				System.out.println("");
				System.out.println("HealthInsurance - " + pd.healthInsurance);
				System.out.println("allergies - " + pd.allergies);
				System.out.println("Smoking - " + pd.Smoking);
				System.out.println("drinking - " + pd.drinking);
				System.out.println("drugs - " + pd.drugs);
				patientfound = true;
			}
		}
		
		if(patientfound == false){
		  System.out.println("No Patient found with the requested ID. Please close the application and try again.");
		}
		
		
		
    }
	
	public static ArrayList<Patient> createPatientList(){
		ArrayList<Patient> patientList = new ArrayList<Patient>();
	    Patient pct = new Patient();
		pct.patientID = "123";
		pct.healthInsurance = "BlueCross";
		pct.allergies = "PeaNut";
		pct.Smoking = "Yes";
		pct.drinking = "No";
		pct.drugs = "No";		
		patientList.add(pct);
		
		Patient pct1 = new Patient();
		pct1.patientID = "526";
		pct1.healthInsurance = "SubLife";
		pct1.allergies = "None";
		pct1.Smoking = "Yes";
		pct1.drinking = "No";
		pct1.drugs = "No";		
		patientList.add(pct1);
		
		Patient pct2 = new Patient();
		pct2.patientID = "876";
		pct2.healthInsurance = "No Insurance";
		pct2.allergies = "AntiBiotic Allergy";
		pct2.Smoking = "No";
		pct2.drinking = "No";
		pct2.drugs = "No";		
		patientList.add(pct2);
		
		Patient pct3 = new Patient();
		pct3.patientID = "356";
		pct3.healthInsurance = "Medavie";
		pct3.allergies = "N/A";
		pct3.Smoking = "Yes";
		pct3.drinking = "Yes";
		pct3.drugs = "Yes";		
		patientList.add(pct3);
		
		return patientList;
	}
}
