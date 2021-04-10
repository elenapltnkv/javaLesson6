public abstract class Animal {
    protected String name;
    protected String swim;
    protected String run;
    protected int sw;
    protected int ru;

    Animal(String name, String swim, String run, int sw, int ru)
    {
        this.name = name;
        this.swim = swim;
        this.run = run;
        this.sw = sw;
        this.ru = ru;
    }

    public void run()
    {
        System.out.println(name + " " + run);
        System.out.println(name + " " + "пробежал на лапках " + ru);
        System.out.println(name + " " +  swim);
        System.out.println(name + " " + "проплыл " + sw);
    }

    public abstract void voice();

}
