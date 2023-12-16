package Session13;

public class ArraysConceptsLimitations
{

    public static void main(String[] args) {
        //10,12,14,35,46
        //dataType[] arrayName={value1, value2, value3.....valueN};
        int[]  numbers   ={10,12,14,35,46,23,66,99};

//        for(int num: numbers)
//        {
//            System.out.println(num);
//        }
//        System.out.println(numbers.length);
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(Arrays.toString(numbers));

          //while
          int i =0;
          while (i<=numbers.length)
          {
              System.out.println(numbers[i]);
              i++;
          }

        // for

//        for (int i =0;i<numbers.length;i++)
//        {
//            System.out.println(numbers[i]);
//        }

        //Jason, Roger, Mike, Ben, Kerrie, Pooja
        //dataType[] arrayName={value1, value2, value3.....valueN};

          String[] studentNames={"Jason", "Roger", "Mike", "Ben", "Kerrie", "Pooja", "Nick"};
//        System.out.println(studentNames.length);
//        System.out.println(studentNames[0]);
//        System.out.println(studentNames[1]);
//        System.out.println(studentNames[2]);
//        System.out.println(studentNames[3]);
//        System.out.println(studentNames[4]);
//        System.out.println(studentNames[5]);
//        System.out.println(Arrays.toString(studentNames));
//          while
//          int i =0;
//          while (i<studentNames.length)
//          {
//              if(studentNames[i]=="Ben")
//              {
//                  System.out.println("Hello Ben");
//              }
//              System.out.println(studentNames[i]);
//              i++;
//          }

        //for

//        for (int i =0;i<studentNames.length;i++)
//        {
//            if(studentNames[i]=="Ben")
//            {
//                System.out.println("Hello Ben");
//            }
//            System.out.println(studentNames[i]);
//
//        }
//        ADVANCE FOR LOOP



//        for(String name: studentNames)
//        {
//            if(name=="Ben")
//            {
//                System.out.println("Hello Ben....");
//            }
//            System.out.println(name);
//        }

    }

}
