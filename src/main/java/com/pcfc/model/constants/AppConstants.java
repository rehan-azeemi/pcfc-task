package com.pcfc.model.constants;

public class AppConstants {
    /*
    * Employee Controller Path
    * */
    public static final String NEW_EMPLOYEE_PATH = "/new/employee";
    public static final String SAVE_EMPLOYEE_PATH = "/save/employee";
    public static final String LISTING_EMPLOYEE_PATH = "/listing/employee";
    public static final String EDIT_EMPLOYEE_PATH = "/edit/employee/{id}";
    public static final String UPDATE_EMPLOYEE_PATH = "/update/employee";
    public static final String VIEW_EMPLOYEE_PATH = "/view/employee/{id}";

    /*
     * Employee View Name
     * */
    public static final String HOME_PAGE = "home";
    public static final String ADD_EMPLOYEE_PAGE = "addEmployee";
    public static final String LISTING_EMPLOYEE_PAGE = "listingEmployee";
    public static final String EDIT_EMPLOYEE_PAGE = "editEmployee";
    public static final String VIEW_EMPLOYEE_PAGE = "viewEmployee";

    /*
     * App Constants
     * */
    public static final String EMPTY_STR = "";

    /*
    * App Error Messages
    * */
    public static final String NO_DATA_FOUND_EXCEPTION_MSG = "The employee you are trying to find is not available in our system.";
    public static final String REQUIRED_FIELD_EXCEPTION_MSG = "%s field is required";
    public static final String DOB_EXCEPTION_MSG = "%s cannot be future date";

}
