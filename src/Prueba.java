import java.sql.;

public class Prueba {


    public Prueba() {

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());


            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mundial", "root", "Marduk1986");


            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            ResultSet rs = s.executeQuery("select from jugador");

            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next()) {
                System.out.println(rs.getInt("Id") + " " + rs.getString(2) +
                        rs.getString(3) + rs.getDouble(4) + rs.getDouble(5) +
                        " " + rs.getDate(6));
            }

            // Se cierra la conexión con la base de datos.
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /

    Método principal, instancia
    una clase PruebaMySQL**
    @param
    args the
    command line arguments*/

    public static void main(String[] args) 
    {
        new PruebaMySql();
    }
﻿

