public class Cat extends Animal {
    Cat (String name, String swim, String run, int sw, int ru){
        super(name, swim, run,sw, ru);
    }
    public void voice (){
        System.out.println(name + "Буся");

    }
}
