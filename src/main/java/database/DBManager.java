package database;

import constants.Constants;
import entity.Discipline;
import entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class DBManager {
    private static Connection conn;
    private static PreparedStatement createNewDiscip;
    private static PreparedStatement deleteDiscip;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            createNewDiscip = conn.prepareStatement("INSERT INTO`discipline` (`discipline`) VALUES ('?');");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createNewDiscip(String discip) {
        try {
            createNewDiscip.setString(1, discip);
            createNewDiscip.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Discipline> getAllActiveDiscipline() {
        ArrayList<Discipline> disciplines = new ArrayList<Discipline>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            System.out.println("ура ура ура ура ура ура");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_15.discipline where status = '1';");


            while (rs.next()) {
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline"));
                disciplines.add(discipline);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplines;
    }

    public static void deleteDiscip(String id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            System.out.println("ура");
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `status` = '0' WHERE (`id`=" + id + ");");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Discipline getDisciplineById(String id) {
        Discipline discipline = new Discipline();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            System.out.println("ура ура ура ура ура ура");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_15.discipline where status = '1' AND id=" + id + ";");


            while (rs.next()) {
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return discipline;
    }

    public static void modifyDiscip(String id, String discip) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            System.out.println("ура 2раза ");
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `discipline` = '" + discip + "' WHERE (`id` = '" + id + "');");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static boolean isExistUser(String login, String password, String role) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user_role as ur\n" +
                    "left join user as u on ur.id_user = u.id\n" +
                    "where u.login = '" + login + "' and u.password = '" + password + "' and ur.id_role = " + role);


            while (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
