public class EmployeePayrollServiceDB {
        public static void main(String[] args) {
            String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service?useSSL=false";
            System.out.println("Connection to database: " + jdbcURL);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver Loaded");

            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Cannot find drier in classpath!");
            }
        }
    }

