package database;

import constants.Constants;
import entity.Discipline;
import entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            System.out.println("ура");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            ArrayList<Student> students = new ArrayList<Student>();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setSername(rs.getString("sername"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("data"));
                students.add(student);
            }
            for (Student s : students) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void createNewDiscip(String discip) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            System.out.println("ура");
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO`discipline` (`discipline`) VALUES ('" + discip + "');");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static ArrayList<Discipline> getAllActiveDiscipline () {
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
    public static Discipline getDisciplineById (String id){
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
}
