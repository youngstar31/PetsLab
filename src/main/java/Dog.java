public class Dog extends Pets implements IGreet{
    public Dog (String name){
        super(name);
    }


    @Override
    public String speak(){
        return "Ruff Ruff";
    }

    @Override
    public void greeting() {
        System.out.println("Dog is jumpy and licks you");
    }
}
