public class Main {
    public static void main(String[] args) {
        var db = DBConnection.getDbConnection();

        var db1 = DBConnection.getDbConnection();
        System.out.println(db1);

        var db2 = DBConnection.getDbConnection();
        System.out.println(db2);

        var db3 = DBConnection.getDbConnection();
        System.out.println(db3);

        var db4 = DBConnection.getDbConnection();
        System.out.println(db4);





    }
}