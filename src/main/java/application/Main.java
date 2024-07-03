package application;

import db.DB;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Connection connection = DB.getConnection();
        DB.closeConnection();




    }
}