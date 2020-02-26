package com.daumsoft.ckan.sql;


public class Sql {  
    public static final String SELECT_ALL = "SELECT * FROM shelter_table";
    public static final String SELECT_FIRST = "SELECT * FROM shelter_table WHERE (latitude >= :laLow and latitude <= :laHigh) and (longitude >= :loLow and longitude <= :loHigh) ";
    public static final String SELECT_OTHERS = "SELECT * FROM shelter_table WHERE latitude < :laLow or latitude > :laHigh or longitude < :loLow or longitude > :loHigh;";
    //.050724
    //.97891

}