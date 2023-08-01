/**
 * EMPLOY
 */
class EMPLOY {
    String E_name;
    int project_ID,dept_ID;
    void get_details(String name,int pid,int did){
        E_name = name;
        project_ID = pid;
        dept_ID = did;
    }
    void terminate(){
        E_name = "";
        dept_ID= 
    }
}

/**
 * DEPT
 */
class DEPT {
    String dept_name;
    float salary;
    String[] dept_list = {"DEVOP","Reserch","web"};
    EMPLOY emp1 = new EMPLOY();
    void gen_details(){
        dept_name = dept_list[emp1.dept_ID];
    }
    void get_sal(){
        if (emp1.dept_ID == 0) {
            salary = 900000;
        }
        else if (emp1.dept_ID == 1) {
            salary = 1200000;
        }
        else{
            salary = 500000;
        }
    }    
}

/**
 * PROJECT
 */

public class emprec {
    public static void main(String[] args) {
        EMPLOY emp = new EMPLOY();
        emp.get_details("shashank", 12, 0);
        DEPT dept = new DEPT();
        dept.gen_details();
        dept.get_sal();
        System.out.println(emp.E_name+" "+emp.project_ID+" "+dept.dept_name+" "+dept.salary);
    }
    
}
