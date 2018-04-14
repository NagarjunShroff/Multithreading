package test;

public class reportIP {

	public static void main(String[] args) {


		String CurrentFile =  "smb://164.99.175.102/cifs/nag/test.dump__1519364713000__0__0__";	
		String type,value = null;
		type = CurrentFile.split(":")[0];

		if(type.equals("smb")) {
			value = CurrentFile.split("\\//")[1].split("\\/")[0];
		}
   System.out.println("Value :"+value);
	}
}