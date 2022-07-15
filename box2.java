class box2
{
float  length, breadth, height, V;
 public box2(float l, float b, float h)
{
    length = l;
    breadth = b;
    height = h;
    V = volume();


}
float volume()
{
float vol = length*breadth*height;
System.out.println("The volume is : " +vol);
return vol;
}
 public static void main(String[] args) {
        
        float l = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float h = Float.parseFloat(args[2]);
        float d = Float.parseFloat(args[3]);
        float e = Float.parseFloat(args[4]);
        float f = Float.parseFloat(args[5]);

box2 obj1 =  new box2(l,b,h);
box2 obj2 =  new box2(d,e,f);
if(obj1.V>obj2.V)
{
System.out.println("Volume of cube is greater");
}
else
{
System.out.println("Volume of cube is greater");
}
}
}