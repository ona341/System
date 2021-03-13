package Singleton;

import Entities.Employee;

import java.util.TreeMap;

/**
 * A Employee Map using the singleton pattern.
 */
public class EmployeeMapAccess {

    /**
     * The singleton employee map
     */
    private static final TreeMap<String, Employee> employees = new TreeMap<>();

    /**
     * Private do nothing constructor
     */
    private EmployeeMapAccess() {}

    /**
     * Gets the instance of the map.
     *
     * @return the map instance
     */
    public static TreeMap<String, Employee> getInstance() {
        return employees;
    }
}
