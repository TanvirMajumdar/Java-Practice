package runner;

import services.CreatingEmployee;
import services.DeletingEmployee;
import services.FindingEmployee;
import services.UpdatingEmployee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindingEmployee f= new FindingEmployee();
		CreatingEmployee c= new CreatingEmployee();
		UpdatingEmployee u= new UpdatingEmployee();
		DeletingEmployee d= new DeletingEmployee();
		
		f.findingEmployee();
		//c.creatingEmployee();
		//u.updatingEmployee();
		//d.deletingEmployee();
		
	}

}
