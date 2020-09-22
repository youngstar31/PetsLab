public class Pets {
    private String name;

    public Pets(){


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Pets(String name){
        this.name = name;


    }

    public String speak(){
        return "This animal is speaking";
    }

}
