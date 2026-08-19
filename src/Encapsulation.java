public class Encapsulation {
    public static void main(String[] args) {
        Employee emp1 = new Employee("1001","akila");
        emp1.setSalary(35000);
        emp1.promoteEmployee(12);


    }
}

class Employee{
    private String empId;
    private String name;
    private double salary;

    public Employee(String empId,String name){
        this.empId=empId;
        this.name= name;

    }

    public void setName(String name){
        if(name==null || name.equals("")){
            System.out.println("invalid name");
        }else {
            this.name=name;
        }

    }

    public void setSalary(double salary){
        if(salary<30000){
            System.out.println("salary must be  at least 30000");


        }else  {
            this.salary=salary;
        }
    }

    public void promoteEmployee(double percentage){
        if(percentage<0){
            System.out.println("invalid percentage");
        }else {
            double new_salary= (salary*percentage)/100 + salary;
            salary = new_salary;
            System.out.println("New salary is "+new_salary);
        }

    }

}


