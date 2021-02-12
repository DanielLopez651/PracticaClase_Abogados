package ups.edu.ec.controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ups.edu.ec.modelo.*;
public class ControladorBD {
    Connection conn = null;
    public void conectarme(){
        
            String urlDatabase =  "jdbc:postgresql://localhost:5432/AB"; 
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(urlDatabase,  "postgres", "DanielL651");
            } catch (Exception e) {
                System.out.println("Ocurrio un error : "+e.getMessage());
            }
            System.out.println("La conexión se realizo sin problemas ");
    }
    public void ingreso(String datos){
        PreparedStatement p=null;
        conectarme();
        try{
            
            p=conn.prepareStatement(datos);
            System.out.println(datos);
            p.executeUpdate();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public List<Cliente> ListaCliente(String sql)throws Exception{
       List<Cliente> clientes=new ArrayList<Cliente>();
        if(conn==null){
            conectarme();
        }
        PreparedStatement ps=null;
        try{
            ps=conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Cliente c=new Cliente();
                c.setApellido(rs.getString("apellido"));
                c.setCedula(rs.getString("cedula"));
                c.setNombre(rs.getString("nombre"));
                c.setId(Integer.parseInt(rs.getString("id")));
                
                clientes.add(c);
            }
            
        }catch(Exception ex){
            throw ex;
        }finally{
            ps.close();
            conn.close();
        }
        return clientes;
        
    }
    
    
    
    
    
    
    
    
        public List<Expediente> ListaExpediente(String sql)throws Exception{
       List<Expediente> expedientes=new ArrayList<Expediente>();
        if(conn==null){
            conectarme();
        }
        PreparedStatement ps=null;
        try{
            ps=conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Expediente c=new Expediente();
                c.setCedulacliente(rs.getString("cedulacliente"));
                c.setEstado(rs.getString("estado"));
                c.setFechadefinalisacion(rs.getString("fechafinalizacion"));
                c.setFechadeinicio(rs.getString("fechainicio"));
                c.setId(Integer.parseInt(rs.getString("id")));
                
                expedientes.add(c);
            }
            
        }catch(Exception ex){
            throw ex;
        }finally{
            ps.close();
            conn.close();
        }
        return expedientes;
        
    }
        
        
        
        
        
        
        
        public List<Abogado> ListaAbogados(String sql)throws Exception{
       List<Abogado> abogados=new ArrayList<Abogado>();
        if(conn==null){
            conectarme();
        }
        PreparedStatement ps=null;
        try{
            ps=conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Abogado c=new Abogado();
                c.setCedula(rs.getString("cedulaabogado"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setId(Integer.parseInt(rs.getString("id")));
                
                abogados.add(c);
            }
            
        }catch(Exception ex){
            throw ex;
        }finally{
            ps.close();
            conn.close();
        }
        return abogados;
        
    }
    
    
   
}
