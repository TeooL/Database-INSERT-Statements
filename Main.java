public class Main{
    public static void main(String[] args){
        String[] departments = {"Biology", "Chemistry", "CTE", "English", "PE", "Mathematics", "Physics", "Social", "Arts", "Language"};

        int i = 1;
        for (String department: departments){
            System.out.println("INSERT INTO Departments (d_id, Department) VALUES (" + i + ",'" + departments[i-1] + "\');");
            i++;
        }
        for (int s = 1; s < 5001; s++){
            System.out.println("INSERT INTO People (p_id, First_Name, Last_Name) VALUES (" + s + ", 'FirstName" + s + "', 'LastName" + s +"');");
        }
    }
}