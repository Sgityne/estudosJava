package maratonajava.javacore.aula30_serialization.domain;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -3145254228083268660L;
    private Long id;
    private String name;
    private transient String password;
    private transient Class schoolClass;
    private static String schoolName = "devDojo";

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(schoolClass.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String className = ois.readUTF();
            schoolClass = new Class(className);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", schoolName'" + schoolName + '\'' +
                ", Class'" + schoolClass + '\'' +
                '}';
    }

    public Class getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(Class schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
