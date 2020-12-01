public class Employee{

    private string name;
    private int idNumber;
    private string department;
    private string position;

    public void setName( String nameGiven ) {
        name = nameGiven;
        
    }
    
    public void setIdNumber( Int IdNumberGiven ) {
        IdNumber = IdNumberGiven;
        
    }
    
    public void setIdNumber( String IdNumberGiven ) {
        IdNumber = Integer.parseInt( IdNumberGiven );
        
    }

    public void setDepartment( String DepartmentGiven ) {
        department = DepartmentGiven;
        
    } 

    public void setPosition( String PositionGiven ) {
        position = PositionGiven;
        
    }

    public String getName(){
        return name;
    }

    public int getIdNumber(){
        return IdNumber;
    }
    
    public String getDepartment(){
        return department;
    }

    public String getPostion(){
        return position;
    }
   
    Public Employeee( String employeeName, int employeeIdNumber, Sting employeeDepartment, String employeePosition ) {
        name = employeeName;
        IdNumber = employeeIdNamuber;
        department = employeeDepartment;
        position = employeePosition;
       }

       public Empoyee( String employeeName, int employeeIdNumber ){
        name = employeeName;
        IdNumber = employeeIdNamuber;
        department = "";
        position = "";
    }
    
    public Empoyee(  ){
        name = "";
        IdNumber = 0;
        department = "";
        position = "";
    }



}
