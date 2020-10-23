package start;

import java.sql.*;

public class start {
    public static void main(String[] args) {
//        System.out.println("start");
//        calc C = new calc();
//        System.out.println(calc.add(1, 2));
//        str s = new str();
//        System.out.println(s.retstr("2ww"));
//        int[] aaa = {2, 3, 1, 4};
//        for (int a : aaa) {
//            System.out.println(a);
//        }
//        Arrays.sort(aaa);
//        for (int a : aaa) {
//            System.out.println(a);
//        }
//        Set set = new HashSet();
//        set.add("aaa");
//        set.add("bbb");
//        set.add("ccc");
//        set.add(123);
//        set.add(222.11);
//        set.add(123);
//        set.add("aaa");
//        System.out.println(set);
//
//        List arrayList = Arrays.asList(aaa);
//        for (int a : aaa) {
//            System.out.println(a);
//        }
//        System.out.println(arrayList.size());
        db();
    }

    public static void db() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://192.168.1.11:3306/javachat_master";
            Connection connection = DriverManager.getConnection(url, "javachat_master", "javachat_master");
            Statement statement = connection.createStatement();
            String sql = "select * from cq_user where id = ?";
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setInt(1, 1);
            ResultSet result = pre.executeQuery();
            while (result.next()) {
                System.out.println(result.getString("username"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

