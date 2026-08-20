//public class Singlton {
//    public static void main(String[] args) {
//      Singleton s1=Singleton.getInstance();
//      Singleton s2=Singleton.getInstance();
//
//        System.out.println(s1);
//        System.out.println(s2);
//    }
//}
//
//class Singleton{
//
//    private static Singleton instance;
//
//    private Singleton(){
//        System.out.println("singleton crated");
//    }
//
//    public static Singleton getInstance(){
//        if(instance==null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//}


class Singleton{
    public static void main(String[] args) {
      DBConnection db1 = DBConnection.getInstance();
      DBConnection db2 = DBConnection.getInstance();
        System.out.println(db1==db2);
    }
}

class DBConnection{
    private static DBConnection dbInstance;

    private DBConnection(){
        System.out.println("DBConnection created");
    }

    public static DBConnection getInstance(){
        if(dbInstance==null){
            dbInstance=new DBConnection();
        }
        return dbInstance;
    }
}
