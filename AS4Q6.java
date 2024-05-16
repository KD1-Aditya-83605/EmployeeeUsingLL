import java.util.Scanner;

public class AS4Q6 {

//    Implement menudriven program to maintain linked list of employees and provide below operations. i.
//            Add employee (Perfrom any add operation) ii. Display all employees iii. Search employee by name iv.
//    Delete employee by empid v. Update salary of employee

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("welcome to employee mgmt");
       LL list = new LL();

        do {
            System.out.println("Press 0 : To exit");
            System.out.println("Press 1 : To add employee");
            System.out.println("Press 2 : Display all employees");
            System.out.println("Press 3 : Search employee by name ");
            System.out.println("Press 4 : Delete employee by empid");
            System.out.println("Press 5 : Update salary of employee");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                {
                    System.out.println("Thanks");
                    break;
                }
                case 1:
                {
                    int id;
                    String name;
                    double salary;
                    System.out.println("Enter empid: ");
                    id = scanner.nextInt();;
                    System.out.println("Enter name: ");
                    name = scanner.next();
                    System.out.println("Enter salary: ");
                    salary  = scanner.nextDouble();;

                    Employee employee = new Employee(id,name,salary);
                    list.add(employee);
                    break;



                }

                case 2:
                {
                    list.displayData();

                }
                break;
                case 3:
                {
                    System.out.println("Enter name to be searched");
                    String name  = scanner.next();

                    Employee e = new Employee(name);

                    list.searchData(e);

                }
                break;
                case 4:
                {
                    System.out.println("Enter empid to delete");
                    int id = scanner.nextInt();

                    Employee e = new Employee(id);

                    list.deleteData(e);




                }
                case 5:
                {

                }
            }



        }while (choice!= 0);



    }


}
