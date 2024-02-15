import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class ReadFRomDB{

    public void getConnection(){
      
        try{
            // File f = new File("/home/sunil/Desktop/user.txt");
            FileWriter fw = new FileWriter("/home/sunil/Desktop/user.txt",true);
            fw.append("helloo jjjjjjjjjjjjjjjj");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "sunil","sunilsks");
            Statement st=con.createStatement();
            st.executeQuery("select * from users");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                fw.write(rs.getString(1));
            }
        }

        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ReadFRomDB rd = new ReadFRomDB();
        rd.getConnection();
    }
}