package main;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class sestadz {
    public static void main(String[] arsg) {

        double placa = 0.0;
        Logger LOGGER = Logger.getLogger(sestadz.class.getName());

        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            LOGGER.warning("nije se uspjela" + e.getMessage());
        }

        Payroll payroll = new Payroll();
        payroll.addEmployee(new Employee("Ivo", "Ivić", -20, 40));
        payroll.addEmployee(new Employee("Ana", "Anić", 25, 35));
        payroll.addEmployee(new Employee("Petar", "Petrović", 10, 50));
        payroll.addEmployee(new Employee("Ivo", "Ivić", 30, 20));
        payroll.addEmployee(new Employee("Jana", "Janić", 15, 45));


        try {
            for (Employee radnik : payroll)
            {
                if(radnik.getHourlyRate()>=0.0 || radnik.getHoursWorked()>=0.0)
                    LOGGER.info("INFO: " +radnik.getFirstName() + " " + radnik.getLastName() + " " + radnik.placa(radnik.getHourlyRate(), radnik.getHoursWorked()));

            }

        } catch (IllegalArgumentException e) {
            LOGGER.warning("greska" + e.getMessage());
        } /*finally {
            for (Employee radnik : payroll) {
                LOGGER.info("INFO: " +radnik.getFirstName() + " " + radnik.getLastName() + " " + radnik.placa(radnik.getHourlyRate(), radnik.getHoursWorked()));
            }

        }*/

    }
}



