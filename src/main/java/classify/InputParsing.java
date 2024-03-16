package classify;

import classify.student.Student;
import classify.student.StudentList;

import java.util.ArrayList;
import java.util.Scanner;

public class InputParsing {
    private static final String BYE = "bye";
    private static final String LIST = "list";
    private static final String ADD = "add";
    private static final String DELETE = "delete";
    private static final String WRONG_INPUT_MESSAGE = "Wrong Input! Please try again!";

    //@@author tayponghee
    public static void parseUserCommand(String userCommand, ArrayList<Student> masterStudentList, Scanner in){
        switch (userCommand) {
        case BYE:
            Ui.printEndConversation();
            break;

        //@@author ParthGandhiNUS
        case LIST:
            if (masterStudentList != null) {
                StudentList.printCurrentArrayList(masterStudentList);
            } else {
                System.out.println("Student list is null.");
            }
            Ui.printDivider();
            break;

        default:
            System.out.println(WRONG_INPUT_MESSAGE);
            Ui.printDivider();
            break;
        }
    }
}