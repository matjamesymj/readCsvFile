package uk.co.allwebwork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReadCsvFileHelper {


    public List<Vehicle> processInputFile(String filePath) throws FileNotFoundException {

        List<Vehicle> vehicleList = new ArrayList<>();
        String line = "";

        try{
            File file = new File(filePath);
            InputStream inputFS = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

            while ((line = br.readLine())!=null){
                String[] vehicleLine = line.split(",");
                Vehicle vehicle;
                if(Objects.equals(vehicleLine[0], "Car")){
                   vehicle = new Car();
                   vehicle.setReg(vehicleLine[1]);
                   vehicle.setMake(vehicleLine[2]);
               } else{
                    Bike bike = new Bike();
                    bike.setReg(vehicleLine[1]);
                    bike.setMake(vehicleLine[2]);
                    bike.setBikeSpecificParam(vehicleLine[3]);
                    vehicle = bike;
                }

                vehicleList.add(vehicle);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return vehicleList;
    }

    public List<Vehicle> processInputFileWithLambda(String filePath) throws FileNotFoundException {

        List<Vehicle> vehicleList = new ArrayList<>();

        try {
            File file = new File(filePath);
            InputStream inputFS = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
            vehicleList = br.lines().map(mapToItem).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vehicleList;

    }

    private Function<String, Vehicle> mapToItem = (line) -> {
        String[] vehicleLine = line.split(",");
        Vehicle vehicle;
        if (Objects.equals(vehicleLine[0], "Car")) {
            vehicle = new Car();
            vehicle.setReg(vehicleLine[1]);
            vehicle.setMake(vehicleLine[2]);
        } else {
            Bike bike = new Bike();
            bike.setReg(vehicleLine[1]);
            bike.setMake(vehicleLine[2]);
            bike.setBikeSpecificParam(vehicleLine[3]);
            vehicle = bike;
        }


        return vehicle;
    };

}
