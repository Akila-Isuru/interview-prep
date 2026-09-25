package DesignPatterns;

class DBConnection{

    private static DBConnection dbInstance;

    private  DBConnection(){
        System.out.println("DB Connection Created...");
    }

    public static DBConnection getInstance(){
        if(dbInstance== null){
            dbInstance= new DBConnection();
        }
        return dbInstance;
    }
}



public class SingletonDesignPattern {
    public static void main(String[] args) {

        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();
        System.out.println(db1 == db2);

    }
}
