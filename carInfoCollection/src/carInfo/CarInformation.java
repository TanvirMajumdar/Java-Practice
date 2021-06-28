package carInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarInformation {
	
	public ArrayList<Car> setCarInformation(){
		
		ArrayList<Car> list = new ArrayList<Car>();
		
		Scanner scan= null;
		File f= new File("D:\\cars.txt");
		
		try {
			scan = new Scanner(f);
			scan.nextLine();
			scan.nextLine();
			while(scan.hasNext()) {
				
				String[] input= scan.nextLine().split(",");
				Car car =new Car();
				car.setCar(input[0]);
				car.setMpg(Double.valueOf(input[1]));
				car.setCylinders(Integer.valueOf(input[2]));
				car.setDisplacement(Double.valueOf(input[3]));
				car.setHorsepower(Double.valueOf(input[4]));
				car.setWeight(Double.valueOf(input[5]));
				car.setAcceleration(Double.valueOf(input[6]));
				car.setModel(Integer.valueOf(input[7]));
				car.setOrigin(input[8]);
				
				list.add(car);
				
			}
			
			scan.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	
	public void getCarInformation(){

	ArrayList<Car> carsinfo = setCarInformation();
	for(Car car : carsinfo )

	{

	System.out.println(car.getCar()+" "+car.getMpg()+" "+ car.getCylinders()+" "+car.getDisplacement()
	+" "+ car.getHorsepower()+" "+ car.getWeight()+" "+car.getAcceleration()+" "+ car.getModel()+" "+car.getOrigin());

	}

	}
}
