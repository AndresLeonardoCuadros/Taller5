package edu.unbosque.Taller5_AndresCuadros.resources.pojos;

public class Official {

    private String username;
    private String name;
    private Integer person_id;

    public Official(){
    }

    public Official(String username,String name,Integer person_id){
        this.username = username;
        this.name = name;
        this.person_id = person_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPerson_id() {return person_id;}

    public void setPerson_id(Integer person_id) {this.person_id = person_id;}
}
