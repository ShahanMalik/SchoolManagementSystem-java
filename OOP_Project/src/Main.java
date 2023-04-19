import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("School management system ");
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ClassOneAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassTwoAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassThreeAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassFourAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassFiveAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassSixAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassSevenAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassEightAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassNineAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));
        ArrayList<Integer> ClassTenAttendance = new ArrayList<Integer>(Arrays.asList(94, 96, 91));

        ArrayList<Integer> ClassOneMarks = new ArrayList<Integer>(Arrays.asList(30, 70, 90));
        ArrayList<Integer> ClassTwoMarks = new ArrayList<Integer>(Arrays.asList(80, 30, 90));
        ArrayList<Integer> ClassThreeMarks = new ArrayList<Integer>(Arrays.asList(10, 70, 90));
        ArrayList<Integer> ClassFourMarks = new ArrayList<Integer>(Arrays.asList(80, 47, 90));
        ArrayList<Integer> ClassFiveMarks = new ArrayList<Integer>(Arrays.asList(80, 40, 90));
        ArrayList<Integer> ClassSixMarks = new ArrayList<Integer>(Arrays.asList(80, 70, 39));
        ArrayList<Integer> ClassSevenMarks = new ArrayList<Integer>(Arrays.asList(8, 70, 90));
        ArrayList<Integer> ClassEigthMarks = new ArrayList<Integer>(Arrays.asList(80, 33, 90));
        ArrayList<Integer> ClassNineMarks = new ArrayList<Integer>(Arrays.asList(80, 37, 90));
        ArrayList<Integer> ClassTenMarks = new ArrayList<Integer>(Arrays.asList(80, 70, 44));

        ArrayList<String> classOneStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classTwoStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classThreeStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classFourStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classFiveStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classSixStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classSevenStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classEightStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classNineStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));
        ArrayList<String> classTenStudent = new ArrayList<String>(Arrays.asList("Student1", "Student2", "Student3"));

        String nameOfPrincipal = "Dr Qasim Jan";

        ArrayList<String> phyTeacher = new ArrayList<String>(
                Arrays.asList("PhyTeacher1", "PhyTeacher2", "PhyTeacher3"));
        ArrayList<String> mathTeacher = new ArrayList<String>(
                Arrays.asList("mathTeacher1", "mathTeacher2", "mathTeacher3"));
        ArrayList<String> engTeacher = new ArrayList<String>(
                Arrays.asList("engTeacher1", "engTeacher2", "engTeacher3"));
        ArrayList<String> urduTeacher = new ArrayList<String>(
                Arrays.asList("urduTeacher1", "urduTeacher2", "urduTeacher3"));
        ArrayList<String> computerTeacher = new ArrayList<String>(
                Arrays.asList("computerTeacher1", "computerTeacher2", "computerTeacher3"));

        ArrayList<String> securityGuard = new ArrayList<String>(Arrays.asList("securityGuard1", "securityGuard2",
                "securityGuard3"));

        ArrayList<String> schoolBus = new ArrayList<String>(Arrays.asList("Bus1", "Bus2"));

        ArrayList<String> schoolLabour = new ArrayList<String>(
                Arrays.asList("Labour1", "Labour2", "Labour3"));

        ArrayList<String> schoolOfficeStaff = new ArrayList<String>(
                Arrays.asList("OfficeStaff1", "OfficeStaff2", "OfficeStaff3"));

        System.out.println("if you want to see school details press 1 or press other key to exit");
        int choice = sc.nextInt();
        if (choice != 1) {
            System.out.println("exit");
            System.exit(1);
        } else {
            int doLoop = 0;
            do {
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("SCHOOL MANAGEMENT SYSTEM");
                System.out.println("1- View full detail  [Student Teacher Security...]");
                System.out.println("2- Add new data  [Student Teacher Security...]");
                System.out.println("3- VIew data of specific person  [Student Teacher Security...]");
                System.out.println("4- exit");
                int inputChoice = sc.nextInt();
                doLoop = inputChoice;
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                if (inputChoice == 1) {
                    int doLoop1=0;
                    do{
                    System.out.println("````````````````````VIEW FULL DATA```````````````````");
                    System.out.println("1- Student Details");
                    System.out.println("2- Teacher Details");
                    System.out.println("3- Security Guard Details");
                    System.out.println("4- Office Staff Details");
                    System.out.println("5- Labours Details");
                    System.out.println("6- Bus Details");
                    System.out.println("7- Principal Details");
                    System.out.println(" OR enter any key to exit");

                    Teacher t1 = new Teacher("abc", "A102", "Mirza", "Male", 44,"PHD");
                    SecurityGuard S1=new SecurityGuard("abc", "D102", "Attock", "Male", 66, true);
                    OfficeStaff OS1=new OfficeStaff("abc", "D201", "Attock", "Male", 67, "BcS");
                    Labour L1=new Labour("abc", "D202", "Attock", "Male", 44, false);
                    Principal P1=new Principal("Abc", "A102", "Mirza", "Male", 44, "PHD");

                    int choose = sc.nextInt();
                    doLoop1=choose;
                    if (choose == 1) {
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Class 1 student");
                        int checkOne1 = ClassOneMarks.get(0);
                        if (checkOne1 <= 50) {
                            System.out.println(classOneStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classOneStudent.get(0) + " Student Attendance :"
                                + ClassOneAttendance.get(0) + " Student percentage :" + ClassOneMarks.get(0) + "%");

                        int checkOne2 = ClassOneMarks.get(1);
                        if (checkOne2 <= 50) {
                            System.out.println(classOneStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classOneStudent.get(1) + " Student Attendance :"
                                + ClassOneAttendance.get(1) + " Student percentage :" + ClassOneMarks.get(1) + "%");

                        int checkOne3 = ClassOneMarks.get(2);
                        if (checkOne3 <= 50) {
                            System.out.println(classOneStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classOneStudent.get(2) + " Student Attendance :"
                                + ClassOneAttendance.get(2) + " Student percentage :" + ClassOneMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Class 2 student");
                        int checkTwo1 = ClassTwoMarks.get(0);
                        if (checkTwo1 <= 50) {
                            System.out.println(classTwoStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classTwoStudent.get(0) + " Student Attendance :"
                                + ClassTwoAttendance.get(0) + " Student percentage :" + ClassTwoMarks.get(0) + "%");

                        int checkTwo2 = ClassTwoMarks.get(1);
                        if (checkTwo2 <= 50) {
                            System.out.println(classTwoStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classTwoStudent.get(1) + " Student Attendance :"
                                + ClassTwoAttendance.get(1) + " Student percentage :" + ClassTwoMarks.get(1) + "%");

                        int checkTwo3 = ClassTwoMarks.get(2);
                        if (checkTwo3 <= 50) {
                            System.out.println(classTwoStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classThreeStudent.get(2) + " Student Attendance :"
                                + ClassThreeAttendance.get(2) + " Student percentage :" + ClassThreeMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("class 3 student");
                        int checkThree1 = ClassThreeMarks.get(0);
                        if (checkThree1 <= 50) {
                            System.out.println(classThreeStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classThreeStudent.get(0) + " Student Attendance :"
                                + ClassThreeAttendance.get(0) + " Student percentage :" + ClassThreeMarks.get(0) + "%");

                        int checkThree2 = ClassThreeMarks.get(1);
                        if (checkThree2 <= 50) {
                            System.out.println(classThreeStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classThreeStudent.get(1) + " Student Attendance :"
                                + ClassThreeAttendance.get(1) + " Student percentage :" + ClassThreeMarks.get(1) + "%");

                        int checkThree3 = ClassThreeMarks.get(2);
                        if (checkThree3 <= 50) {
                            System.out.println(classThreeStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classThreeStudent.get(2) + " Student Attendance :"
                                + ClassThreeAttendance.get(2) + " Student percentage :" + ClassThreeMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("class 4 student");
                        int checkFour1 = ClassFourMarks.get(0);
                        if (checkFour1 <= 50) {
                            System.out.println(classFourStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classFourStudent.get(0) + " Student Attendance :"
                                + ClassFourAttendance.get(0) + " Student percentage :" + ClassFourMarks.get(0) + "%");

                        int checkFour2 = ClassFourMarks.get(1);
                        if (checkFour2 <= 50) {
                            System.out.println(classFourStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classFourStudent.get(1) + " Student Attendance :"
                                + ClassFourAttendance.get(1) + " Student percentage :" + ClassFourMarks.get(1) + "%");

                        int checkFour3 = ClassFourMarks.get(2);
                        if (checkFour3 <= 50) {
                            System.out.println(classFourStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classFourStudent.get(2) + " Student Attendance :"
                                + ClassFourAttendance.get(2) + " Student percentage :" + ClassFourMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("class 5 student");
                        int checkFive1 = ClassFiveMarks.get(0);
                        if (checkFive1 <= 50) {
                            System.out.println(classFiveStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classFiveStudent.get(0) + " Student Attendance :"
                                + ClassFiveAttendance.get(0) + " Student percentage :" + ClassFiveMarks.get(0) + "%");

                        int checkFive2 = ClassFiveMarks.get(1);
                        if (checkFive2 <= 50) {
                            System.out.println(classFiveStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classFiveStudent.get(1) + " Student Attendance :"
                                + ClassFiveAttendance.get(1) + " Student percentage :" + ClassFiveMarks.get(1) + "%");

                        int checkFive3 = ClassFiveMarks.get(2);
                        if (checkFive3 <= 50) {
                            System.out.println(classFiveStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classFiveStudent.get(2) + " Student Attendance :"
                                + ClassFiveAttendance.get(2) + " Student percentage :" + ClassFiveMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("class 6 student");
                        int checkSix1 = ClassSixMarks.get(0);
                        if (checkSix1 <= 50) {
                            System.out.println(classSixStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classSixStudent.get(0) + " Student Attendance :"
                                + ClassSixAttendance.get(0) + " Student percentage :" + ClassSixMarks.get(0) + "%");

                        int checkSix2 = ClassSixMarks.get(1);
                        if (checkSix2 <= 50) {
                            System.out.println(classSixStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classSixStudent.get(1) + " Student Attendance :"
                                + ClassSixAttendance.get(1) + " Student percentage :" + ClassSixMarks.get(1) + "%");

                        int checkSix3 = ClassSixMarks.get(2);
                        if (checkSix3 <= 50) {
                            System.out.println(classSixStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classSixStudent.get(2) + " Student Attendance :"
                                + ClassSixAttendance.get(2) + " Student percentage :" + ClassSixMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("class 7 student");
                        int checkSeven1 = ClassSevenMarks.get(0);
                        if (checkSeven1 <= 50) {
                            System.out.println(classSevenStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classSevenStudent.get(0) + " Student Attendance :"
                                + ClassSevenAttendance.get(0) + " Student percentage :" + ClassSevenMarks.get(0) + "%");

                        int checkSeven2 = ClassSevenMarks.get(1);
                        if (checkSeven2 <= 50) {
                            System.out.println(classSevenStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classSevenStudent.get(1) + " Student Attendance :"
                                + ClassSevenAttendance.get(1) + " Student percentage :" + ClassSevenMarks.get(1) + "%");

                        int checkSeven3 = ClassSevenMarks.get(2);
                        if (checkSeven3 <= 50) {
                            System.out.println(classSevenStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classSevenStudent.get(2) + " Student Attendance :"
                                + ClassSevenAttendance.get(2) + " Student percentage :" + ClassSevenMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("class 8 student");
                        int checkEight1 = ClassEigthMarks.get(0);
                        if (checkEight1 <= 50) {
                            System.out.println(classEightStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classEightStudent.get(0) + " Student Attendance :"
                                + ClassEightAttendance.get(0) + " Student percentage :" + ClassEigthMarks.get(0) + "%");

                        int checkEigth2 = ClassEigthMarks.get(1);
                        if (checkEigth2 <= 50) {
                            System.out.println(classEightStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classEightStudent.get(1) + " Student Attendance :"
                                + ClassEightAttendance.get(1) + " Student percentage :" + ClassEigthMarks.get(1) + "%");

                        int checkEigth3 = ClassEigthMarks.get(2);
                        if (checkEigth3 <= 50) {
                            System.out.println(classEightStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classEightStudent.get(2) + " Student Attendance :"
                                + ClassEightAttendance.get(2) + " Student percentage :" + ClassEigthMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("class 9 student");
                        int checkNine1 = ClassNineMarks.get(0);
                        if (checkNine1 <= 50) {
                            System.out.println(classNineStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classNineStudent.get(0) + " Student Attendance :"
                                + ClassNineAttendance.get(0) + " Student percentage :" + ClassNineMarks.get(0) + "%");

                        int checkNine2 = ClassNineMarks.get(1);
                        if (checkNine2 <= 50) {
                            System.out.println(classNineStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classNineStudent.get(1) + " Student Attendance :"
                                + ClassNineAttendance.get(1) + " Student percentage :" + ClassNineMarks.get(1) + "%");

                        int checkNine3 = ClassNineMarks.get(2);
                        if (checkNine3 <= 50) {
                            System.out.println(classNineStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classNineStudent.get(2) + " Student Attendance :"
                                + ClassNineAttendance.get(2) + " Student percentage :" + ClassNineMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("class 10 student");
                        int checkTen1 = ClassTenMarks.get(0);
                        if (checkTen1 <= 50) {
                            System.out.println(classTenStudent.get(0) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classTenStudent.get(0) + " Student Attendance :"
                                + ClassTenAttendance.get(0) + " Student percentage :" + ClassTenMarks.get(0) + "%");

                        int checkTen2 = ClassTenMarks.get(1);
                        if (checkTen2 <= 50) {
                            System.out.println(classTenStudent.get(1) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classTenStudent.get(1) + " Student Attendance :"
                                + ClassTenAttendance.get(1) + " Student percentage :" + ClassTenMarks.get(1) + "%");

                        int checkTen3 = ClassTenMarks.get(2);
                        if (checkTen3 <= 50) {
                            System.out.println(classTenStudent.get(2) + " are on prop");
                        } else {
                        }
                        System.out.println("Student Name :" + classTenStudent.get(2) + " Student Attendance :"
                                + ClassTenAttendance.get(2) + " Student percentage :" + ClassTenMarks.get(2) + "%");

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    }

                    else if (choose == 2) {
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("English Teacher");
                        System.out.println(engTeacher);
                        System.out.print("Salary :");
                        t1.CalculateEarning();
                        System.out.print("Working Hours :");
                        t1.OfficeHours();
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Urdu Teacher");
                        System.out.println(urduTeacher);
                        System.out.print("Salary :");
                        t1.CalculateEarning();
                        System.out.print("Working Hours :");
                        t1.OfficeHours();
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Physics Teacher");
                        System.out.println(phyTeacher);
                        System.out.print("Salary :");
                        t1.CalculateEarning();
                        System.out.print("Working Hours :");
                        t1.OfficeHours();
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Math Teacher");
                        System.out.println(mathTeacher);
                        System.out.print("Salary :");
                        t1.CalculateEarning();
                        System.out.print("Working Hours :");
                        t1.OfficeHours();                        
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Computer Teacher");
                        System.out.println(computerTeacher);
                        System.out.print("Salary :");
                        t1.CalculateEarning();
                        System.out.print("Working Hours :");
                        t1.OfficeHours();                        
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    }

                    else if (choose == 3) {
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Security Guard");
                        System.out.println(securityGuard);
                        System.out.print("Salary :");
                        S1.CalculateEarning();
                        System.out.print("Working Hours :");
                        S1.OfficeHours();
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    }

                    else if (choose == 4) {
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Office Staff");
                        System.out.println(schoolOfficeStaff);
                        System.out.print("Salary :");
                        OS1.CalculateEarning();
                        System.out.print("Working Hours :");
                        OS1.OfficeHours();
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    }

                    else if (choose == 5) {
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Labour");
                        System.out.println(schoolLabour);
                        System.out.print("Salary :");
                        L1.CalculateEarning();
                        System.out.print("Working Hours :");
                        L1.OfficeHours();
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    }

                    else if (choose == 6) {
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("School Bus");
                        System.out.println(schoolBus);
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    } else if (choose == 7) {
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("School Principal");
                        System.out.println(nameOfPrincipal);
                        System.out.print("Salary :");
                        P1.CalculateEarning();
                        System.out.print("Working Hours :");
                        P1.OfficeHours();
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    } 
                    else {
                        System.out.println("EXIT");
                    }
                }while(doLoop1<8);
            }
                else if (inputChoice == 2) {
                    int doLoop2=0;
                    do{
                    System.out.println("````````````````````ADD DATA```````````````````");
                    System.out.println("Add new data ");
                    System.out.println("1- Add new Student");
                    System.out.println("2- Add new Teacher");
                    System.out.println("3- Add new Security Guard");
                    System.out.println("4- Add new Labour");
                    System.out.println("5- Add new Office Staff");
                    System.out.println("6- Add new Bus");
                    System.out.println("7- Add new Principal");
                    System.out.println(" OR enter any key to exit");
                    int newData = sc.nextInt();
                    doLoop2=newData;
                    if (newData == 1) {
                        System.out.println("In which class you want to add new students [total 10 classes]");
                        int addClass = sc.nextInt();
                        if (addClass == 1) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classOneStudent, newStudent);
                            }
                            System.out.println(classOneStudent);
                        } else if (addClass == 2) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classTwoStudent, newStudent);
                            }
                            System.out.println(classTwoStudent);
                        } else if (addClass == 3) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classThreeStudent, newStudent);
                            }
                            System.out.println(classThreeStudent);
                        } else if (addClass == 4) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classFourStudent, newStudent);
                            }
                            System.out.println(classFourStudent);
                        } else if (addClass == 5) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classFiveStudent, newStudent);
                            }
                            System.out.println(classFiveStudent);
                        } else if (addClass == 6) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classSixStudent, newStudent);
                            }
                            System.out.println(classSixStudent);
                        } else if (addClass == 7) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classSevenStudent, newStudent);
                            }
                            System.out.println(classSevenStudent);
                        } else if (addClass == 8) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classEightStudent, newStudent);
                            }
                            System.out.println(classEightStudent);
                        } else if (addClass == 9) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classNineStudent, newStudent);
                            }
                            System.out.println(classNineStudent);
                        } else if (addClass == 10) {
                            System.out.println("How many students you want to add");
                            int addStudent = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addStudent; i++) {
                                System.out.println("Enter the name of the student " + (i + 1));
                                String newStudent = sc.nextLine();
                                Collections.addAll(classTenStudent, newStudent);
                            }
                            System.out.println(classTenStudent);
                        } else {
                            System.out.println("invalid input");
                        }

                    }

                    else if (newData == 2) {
                        System.out.println("Which teacher you want to add  [Physics , Computer , English , Math , Urdu]");
                        String fix1 = sc.nextLine();
                        String subjectTeacher = sc.nextLine();
                        if (subjectTeacher.equals("Physics")) {
                            System.out.println("How many Teacher you want to add");
                            int addTeacher = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addTeacher; i++) {
                                System.out.println("Enter the name of the Teacher " + (i + 1));
                                String newTeacher = sc.nextLine();
                                Collections.addAll(phyTeacher, newTeacher);
                            }
                            System.out.println(phyTeacher);
                        } else if (subjectTeacher.equals("Computer")) {
                            System.out.println("How many Teacher you want to add");
                            int addTeacher = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i < addTeacher; i++) {
                                System.out.println("Enter the name of the Teacher " + (i + 1));
                                String newTeacher = sc.nextLine();
                                Collections.addAll(computerTeacher, newTeacher);
                            }
                            System.out.println(computerTeacher);
                        } else if (subjectTeacher.equals("English")) {
                            System.out.println("How many Teacher you want to add");
                            int addTeacher = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i <= addTeacher; i++) {
                                System.out.println("Enter the name of the Teacher " + (i + 1));
                                String newTeacher = sc.nextLine();
                                Collections.addAll(engTeacher, newTeacher);
                            }
                            System.out.println(engTeacher);
                        } else if (subjectTeacher.equals("Math")) {
                            System.out.println("How many Teacher you want to add");
                            int addTeacher = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i <= addTeacher; i++) {
                                System.out.println("Enter the name of the Teacher " + (i + 1));
                                String newTeacher = sc.nextLine();
                                Collections.addAll(mathTeacher, newTeacher);
                            }
                            System.out.println(mathTeacher);
                        } else if (subjectTeacher.equals("Urdu")) {
                            System.out.println("How many Teacher you want to add");
                            int addTeacher = sc.nextInt();
                            String fix = sc.nextLine();
                            for (int i = 0; i <= addTeacher; i++) {
                                System.out.println("Enter the name of the Teacher " + (i + 1));
                                String newTeacher = sc.nextLine();
                                Collections.addAll(urduTeacher, newTeacher);
                            }
                            System.out.println(urduTeacher);
                        } else {
                            System.out.println("invalid input");
                        }

                    }

                    else if (newData == 3) {
                        System.out.println("How many Security Guard you want to add ");
                        int SecurityGuard = sc.nextInt();
                        String fix = sc.nextLine();
                        for (int i = 0; i < SecurityGuard; i++) {
                            System.out.println("Enter the name of the Security Guard  " + (i + 1));
                            String newSecurityGuard = sc.nextLine();
                            Collections.addAll(securityGuard, newSecurityGuard);
                        }
                        System.out.println(securityGuard);
                    }

                    else if (newData == 4) {
                        System.out.println("How many Labour you want to add ");
                        int Labour = sc.nextInt();
                        String fix = sc.nextLine();
                        for (int i = 0; i < Labour; i++) {
                            System.out.println("Enter the name of the Labour " + (i + 1));
                            String newschoolLabour = sc.nextLine();
                            Collections.addAll(schoolLabour, newschoolLabour);
                        }
                        System.out.println(schoolLabour);
                    }

                    else if (newData == 5) {
                        System.out.println("How many Office Staff you want to add ");
                        int OfficeStaff = sc.nextInt();
                        String fix = sc.nextLine();
                        for (int i = 0; i < OfficeStaff; i++) {
                            System.out.println("Enter the name of the Office Staff " + (i + 1));
                            String newOfficeStaff = sc.nextLine();
                            Collections.addAll(schoolOfficeStaff, newOfficeStaff);
                        }
                        System.out.println(schoolOfficeStaff);
                    }

                    else if (newData == 6) {
                        System.out.println("How many School Bus you want to add ");
                        int SchoolBus = sc.nextInt();
                        String fix = sc.nextLine();
                        for (int i = 0; i < SchoolBus; i++) {
                            System.out.println("Enter the name of the School Bus " + (i + 1));
                            String newSchoolBus = sc.nextLine();
                            Collections.addAll(schoolBus, newSchoolBus);
                        }
                        System.out.println(schoolBus);
                    } else if (newData == 7) {
                        System.out.println("Enter name of new Principal");
                        String fix = sc.nextLine();
                        String SchoolPrincipal = sc.nextLine();
                        nameOfPrincipal = SchoolPrincipal;
                        System.out.println("New Principal : "+nameOfPrincipal);
                    } else {
                        System.out.println("EXIT");
                    }
                }while(doLoop2<8);
                }

                else if (inputChoice == 3) {
                    System.out.println("if you want to see the details of the specific person enter 1 ");
                    int choice1 = sc.nextInt();
                    if (choice1 != 1) {
                        System.out.println("Exit");
                    } else {
                        int doLoop3=0;
                        do{
                        System.out.println("``````````````````````````````````````````````````````````````");
                        System.out.println("````````````````````VIEW DATA```````````````````");
                        System.out.println("1- Student Details");
                        System.out.println("2- Teacher Details");
                        System.out.println("3- Security Guard Details");
                        System.out.println("4- Office Staff Details");
                        System.out.println("5- Labours Details");
                        System.out.println("6- Bus Details");
                        System.out.println("7- Principal Details");
                        System.out.println(" OR enter any key to exit");
                        System.out.println("``````````````````````````````````````````````````````````````");
                        System.out.println("``````````````````````````````````````````````````````````````");
                        int choice2 = sc.nextInt();
                        doLoop3=choice2;
                        if (choice2 == 1) {
                            System.out.println("Which class student you want to access ? [hint : total 10 class]");
                            int access1 = sc.nextInt();
                            if (access1 == 1) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input value");
                                }
                                Student s1 = new Student(classOneStudent.get(access2 - 1), "A102", "Mirza", "Male", 12,
                                        "7-2",
                                        ClassOneMarks.get(access2 - 1), ClassOneAttendance.get(access2 - 1));
                                System.out.println(s1);
                            } else if (access1 == 2) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s2 = new Student(classTwoStudent.get(access2 - 1), "A102", "Mirza", "Male", 12,
                                        "7-2",
                                        ClassTwoMarks.get(access2 - 1), ClassTwoAttendance.get(access2 - 1));
                                System.out.println(s2);
                            } else if (access1 == 3) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s3 = new Student(classThreeStudent.get(access2 - 1), "A102", "Mirza", "Male",
                                        12, "7-2",
                                        ClassThreeMarks.get(access2 - 1), ClassThreeAttendance.get(access2 - 1));
                                System.out.println(s3);
                            } else if (access1 == 4) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s4 = new Student(classFourStudent.get(access2 - 1), "A102", "Mirza", "Male", 12,
                                        "7-2",
                                        ClassFourMarks.get(access2 - 1), ClassFourAttendance.get(access2 - 1));
                                System.out.println(s4);
                            } else if (access1 == 5) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s5 = new Student(classFiveStudent.get(access2 - 1), "A102", "Mirza", "Male", 12,
                                        "7-2",
                                        ClassFiveMarks.get(access2 - 1), ClassFiveAttendance.get(access2 - 1));
                                System.out.println(s5);
                            } else if (access1 == 6) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s6 = new Student(classSixStudent.get(access2 - 1), "A102", "Mirza", "Male", 12,
                                        "7-2",
                                        ClassSixMarks.get(access2 - 1), ClassSixAttendance.get(access2 - 1));
                                System.out.println(s6);
                            } else if (access1 == 7) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s7 = new Student(classSevenStudent.get(access2 - 1), "A102", "Mirza", "Male",
                                        12, "7-2",
                                        ClassSevenMarks.get(access2 - 1), ClassSevenAttendance.get(access2 - 1));
                                System.out.println(s7);
                            }

                            else if (access1 == 8) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s8 = new Student(classEightStudent.get(access2 - 1), "A102", "Mirza", "Male",
                                        12, "7-2",
                                        ClassEigthMarks.get(access2 - 1), ClassEightAttendance.get(access2 - 1));
                                System.out.println(s8);
                            }

                            else if (access1 == 9) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s9 = new Student(classNineStudent.get(access2 - 1), "A102", "Mirza", "Male", 12,
                                        "7-2",
                                        ClassNineMarks.get(access2 - 1), ClassNineAttendance.get(access2 - 1));
                                System.out.println(s9);
                            }

                            else if (access1 == 10) {
                                System.out.println("which student you want to access [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Student s10 = new Student(classTenStudent.get(access2 - 1), "A102", "Mirza", "Male", 12,
                                        "7-2",
                                        ClassSevenMarks.get(access2 - 1), ClassTenAttendance.get(access2 - 1));
                                System.out.println(s10);
                            } else {
                                System.out.println("invalid input");
                            }
                        } else if (choice2 == 2) {
                            System.out.println("Which teacher detail you want to view  [Physics , Computer , English , Math , Urdu]");
                            String fix=sc.nextLine();
                            String inputTeacherName = sc.nextLine();
                            if (inputTeacherName.equals("Physics")) {
                                System.out.println("which physics teacher you want to access? [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Teacher pt1 = new Teacher(phyTeacher.get(access2 - 1), "A102", "Mirza", "Male", 44,
                                        "PHD");
                                System.out.println(pt1);
                            } 
                            else if (inputTeacherName.equals("Computer")) {
                                System.out.println("which Computer teacher you want to access? [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Teacher ct1 = new Teacher(computerTeacher.get(access2 - 1), "A102", "Mirza", "Male", 44,
                                        "PHD");
                                System.out.println(ct1);
                            } 
                            else if (inputTeacherName.equals("English")) {
                                System.out.println("which English teacher you want to access? [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Teacher et1 = new Teacher(engTeacher.get(access2 - 1), "A102", "Mirza", "Male", 44,
                                        "PHD");
                                System.out.println(et1);
                            } 
                            else if (inputTeacherName.equals("Math")) {
                                System.out.println("which Math teacher you want to access? [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Teacher mt1 = new Teacher(mathTeacher.get(access2 - 1), "A102", "Mirza", "Male", 44,
                                        "PHD");
                                System.out.println(mt1);
                            } 
                            else if (inputTeacherName.equals("Urdu")) {
                                System.out.println("which Urdu teacher you want to access? [hint : total 3 students]");
                                int access2 = sc.nextInt();
                                if (access2 >= 4) {
                                    System.out.println("invalid input vlaue");
                                }
                                Teacher ut1 = new Teacher(urduTeacher.get(access2 - 1), "A102", "Mirza", "Male", 44,
                                        "PHD");
                                System.out.println(ut1);
                            } 
                            
                            
                            else {
                                System.out.println("invalid input");
                            }
                        }
                        else  if (choice2==3){
                            SecurityGuard s1=new SecurityGuard(urduTeacher.get(choice2 - 3), "A102", "Mirza", "Male", 44,true);
                            System.out.println(s1);
                        }
                        else if(choice2==4){
                            OfficeStaff s1=new OfficeStaff(schoolOfficeStaff.get(choice2-4), "A102", "Attock", "Male", 55, "PHD");
                            System.out.println(s1);
                        }
                        else if(choice2==5){
                            Labour l1=new Labour(schoolLabour.get(choice2-5), "A102", "Mirza", "Male", 12, false);
                            System.out.println(l1);
                        }
                        else if(choice2==6){
                            _Bus b1=new _Bus(2);
                            b1.showDetails();
                        }
                        else if(choice2==7){
                            Principal p1=new Principal(nameOfPrincipal, "A103", "Mirza", "Male", 33, "PHD");
                            System.out.println(p1);
                        }
                        else{
                            System.out.println("EXIT");
                        }
                    }while(doLoop3<8);
                    }

                }

            } while (doLoop <= 3);
        }

       
    }

}
