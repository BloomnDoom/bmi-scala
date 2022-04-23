object Main
{
  def main(args: Array[String])=
  {
    var w,h,f,i,c,bmi=0.0f;
    var condition="";
    println("Choose your unit for weight");
    println("1. Kg");
    println("2. Lbs");
    c=scala.io.StdIn.readInt();
    println("Enter your weight");
    w=scala.io.StdIn.readFloat();
    if(c==2) w=lbs_kg(w);
    println("Choose your unit for height");
    println("1. cm");
    println("2. ft in");
    c=scala.io.StdIn.readInt();
    println("Enter your height");
    if(c==1) h=scala.io.StdIn.readFloat();
    else if(c==2)
    {
      println("Enter feet");
      f=scala.io.StdIn.readFloat();
      println("Enter inches");
      i=scala.io.StdIn.readFloat();
      h=ftin_cm(f,i);
    }
    bmi=w*10000/(h*h);
    println("Your bmi is: "+bmi);
    condition=
    {
      if(bmi<18.5) "Underweight";
      else if(bmi>=18.5 && bmi<25) "Normal";
      else if(bmi>=25 && bmi<30) "Overweight";
      else "Obese";
    }
    println("You are "+condition);
  }
  def lbs_kg(w: Float):Float=w/2.25f;
  def ftin_cm(f: Float,i: Float):Float=f*30.0f+i*2.54f;
}
