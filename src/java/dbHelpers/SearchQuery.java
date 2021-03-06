/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;


/**
 *
 * @author Jake Langreck
 */
public class SearchQuery {
    
   private Connection conn;
   private ResultSet results;
   
   
    public SearchQuery(){
        
        Properties props = new Properties(); //MWC
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
        
   
    
    
    public void doSearch(String name){
       

        try {

            String query = "SELECT * from Customers WHERE UPPER(firstName) LIKE ? OR UPPER(lastName) LIKE ? ORDER BY custID ASC";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + name.toUpperCase() + "%");
            ps.setString(2, "%" + name.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
    
    
    
    public String getHTMLTable()
    {
       String table = "";
        table+="<table>";
        table+="<tr>";
        table+="<th> ID </th>";
        table+="<th> First Name </th>";
        table+="<th> Last Name </th>";
        table+="<th> Address: </th>";
        table+="<th> Address2: </th>";
        table+="<th> City </th>";
        table+="<th> State </th>";
        table+="<th> Zip </th>";
        table+="<th> Email Address </th>";
       
        table+="</tr>";
        
        try {
            while(this.results.next()) {
                 Customers customer = new Customers();
                customer.setCustID(this.results.getInt("custID"));
                customer.setFirstName(this.results.getString("firstName"));
                customer.setLastName(this.results.getString("lastName"));
                customer.setAddr1(this.results.getString("Addr1"));
                customer.setAddr2(this.results.getString("Addr2"));
                customer.setCity(this.results.getString("City"));
                customer.setState(this.results.getString("State"));
                customer.setZip(this.results.getString("Zip"));
                customer.setEmailAddr(this.results.getString("emailAddr"));
                
                
                
                table += "<tr>";
                table += "<td>";
                table += customer.getCustID();
                table += "</td>";
                
                table += "<td>";
                table += customer.getFirstName();
                table += "</td>";
                
                table += "<td>";
                table += customer.getLastName();
                table += "</td>";
                
                table += "<td>";
                table += customer.getAddr1();
                table += "</td>";
                
                table += "<td>";
                table += customer.getAddr2();
                table += "</td>";
                
                table += "<td>";
                table += customer.getCity();
                table += "</td>";
                
                table += "<td>";
                table += customer.getState();
                table += "</td>";
                
                table += "<td>";
                table += customer.getZip();
                table += "</td>";
                
                table += "<td>";
                table += customer.getEmailAddr();
                table += "</td>";
                
              
                
                table += "</tr>";
                

            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        table+="</table>";
                
        return table;  
      
    }
   
}
    
    
    

