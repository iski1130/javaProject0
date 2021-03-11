public class Light {
    public static void main(String args[])
    {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        //speed of light, mile per second
        lightspeed=186000;
        days=1000; //how many days
        seconds=days * 24 * 60 * 60; // change days to seconds
        distance=lightspeed*seconds; // find distance
        System.out.print("Light goes about ");
        System.out.print(distance +" miles ");
        System.out.println("in "+days+" days");
    }
}
