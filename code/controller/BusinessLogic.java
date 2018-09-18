package controller;

public class BusinessLogic {


    public String getDataFromDatabase(){

        return "Data fra databasen";
    }


    public void setData(){
        View view = new View();
        System.out.println(view.setData());

    }


}
