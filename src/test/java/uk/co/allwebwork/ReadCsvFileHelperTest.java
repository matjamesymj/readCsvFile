package uk.co.allwebwork;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReadCsvFileHelperTest extends TestCase {
    @Test(expected = FileNotFoundException.class)
    public void testProcessInputFileWithLambdaNotFound() throws Exception {
        ReadCsvFileHelper readCsvFileHelper = new ReadCsvFileHelper();
        readCsvFileHelper.processInputFileWithLambda("c://invalidpath/invalidfile");

    }

    @Test(expected = FileNotFoundException.class)
    public void testProcessInputFileNotFound() throws Exception {
        ReadCsvFileHelper readCsvFileHelper = new ReadCsvFileHelper();
        readCsvFileHelper.processInputFile("c://invalidpath/invalidfile");

    }

    public void testProcessInputFileWithLambda() throws Exception {
        ReadCsvFileHelper readCsvFileHelper = new ReadCsvFileHelper();
       List<Vehicle> vehicles = readCsvFileHelper.processInputFileWithLambda("cars.csv");
       assertTrue(vehicles.size()==3);
       assertTrue(vehicles.stream().filter(vehicle -> Objects.equals(vehicle.getReg(), "M3MAT")).collect(Collectors.toList()).size()>0);

    }

    public void testProcessInputFile() throws Exception {
        ReadCsvFileHelper readCsvFileHelper = new ReadCsvFileHelper();
        List<Vehicle> vehicles = readCsvFileHelper.processInputFile("cars.csv");
        assertTrue(vehicles.size()==3);
        assertTrue(vehicles.stream().filter(vehicle -> Objects.equals(vehicle.getReg(), "M3MAT")).collect(Collectors.toList()).size()>0);

    }




}